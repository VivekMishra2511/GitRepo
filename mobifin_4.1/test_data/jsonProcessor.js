	
function GetMyJson(json) {

//console.log("hello to get student json"+json);
var jsonString = JSON.stringify(json);
//alert("response:"+jsonString);
var start=31;
var end=jsonString.length - 4;
var res = jsonString.slice(start, end); 
res=replaceAll(res,"\\\"","\"");
//alert("trimmed response:"+res);
var jsonObj = JSON.parse(res);
alert("Defect Created with ID:"+jsonObj.key);


/* JSONObject jsonData = new JSONObject(json); 
 console.log("hello to get student json"+jsonData);
 String name = jsonData.getString("name");
 
	  var table="<html><table border=\"1px\">";

	  table=table+"<th> Roll No.</th><th>Name</th><th>Mark1</th><th>Mark2</th><th>Mark3</th>";

		var finalJsonData=json.JSonDataFinal;

		  $.each(finalJsonData, function(index, element) {
			  var jsonData = element.JsonData;

			  table=table+"<tr>";

			  $.each(jsonData, function(index, element) {
					  table=table+"<td>" + element.rollNo +"</td><td>"
					  + element.Name +"</td><td>" + element.M1 +"</td><td>" + element.M2 +"</td><td>" +element.M3 +"</td>";
				    });
				  table=table+"</tr>";

		  });
		  table=table+="</table></html>";

		  $("#output").html(table);
*/
	}
//var BASE_URL="http://localhost:8080/springrest";
	function GetOutput(path,json)
	{
	 $.ajax({						//calling cross domain servelt using jquery ajax
	 	       url: path+JSON.stringify(json),
		 	dataType: 'jsonp',
			jsonpCallback: 'GetMyJson', // the jsonpCallback function to call
			async: false,
			global: false,
			success: function(data) {
                    //alert("success");
                },
			error: function(xhr, status, error) {
			var err = eval("(" + xhr.responseText + ")");
			alert()
			alert(err.Message);
			}
			});
 	   }
	   
	   
function jsonp(url, key, callback) {
    var appendParam = function(url, key, param){
            return url
                + (url.indexOf("?") > 0 ? "&" : "?")
                + key + "=" + param;
        },

        createScript = function(url, callback){
            var doc = document,
                head = doc.head,
                script = doc.createElement("script");

            script
            .setAttribute("src", url);

            head
            .appendChild(script);

            callback(function(){
                setTimeout(function(){
                    head
                    .removeChild(script);
                }, 0);
            });
        },

        q =
            "q" + Math.round(Math.random() * Date.now());

    createScript(
        appendParam(url, key, q), function(remove){
            window[q] =
                function(json){
                    window[q] = undefined;
                    remove();
                    callback(json);
                };
        });
}

function replaceAll(str, find, replace) {
  return str.replace(new RegExp(escapeRegExp(find), 'g'), replace);
}

function escapeRegExp(str) {
    return str.replace(/([.*+?^=!:${}()|\[\]\/\\])/g, "\\$1");
}
