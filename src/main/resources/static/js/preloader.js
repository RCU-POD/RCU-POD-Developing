$("#slide").css("display", "none");
$("#about").css("display", "none");
$(".menu").css("display", "none");
$(".gallery-container").css("display", "none");
$(".graphic-container").css("display", "none");
$("#searchcoffe").css("display", "none");
$(".recommendCoffeContainer").css("display", "none");
$(".contact-sec").css("display", "none");
$("footer").css("display", "none");

$(document).ready(function(){
    $(".triangle-wel").on( "click", function() {
        $('.welcome').slideUp("slow",function(){
            
        });
        $('#slide').show();
        $('#about').show();
        $('.menu').show();
        $('.gallery-container').show(); 
        $('.graphic-container').show();  
        $('#searchcoffe').show();
        $('.recommendCoffeContainer').show();
        $('.contact-sec').show();
        $('footer').show();
    });
});