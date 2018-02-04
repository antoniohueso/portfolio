$(document).ready(function() {

    console.log("Aquí estoy!");

    $("#save-btn").click(function(e){


        console.log("Vamos!", $('#plan-table-data tr'));

        var b_first = true;

        $('#plan-table-data tr').each(function (a, tr) {

            //--- Descartamos la cabecera
            if( b_first ) {
                b_first = false;
            }
            else {

                $('td', tr).each(function (c, td) {
                    console.log(td);

                });
            }

            /*
            var name = $('.attrName', b).text();
            var value = $('.attrValue', b).text();
            ary.push({ Name: name, Value: value });
*/
        });


    });


});