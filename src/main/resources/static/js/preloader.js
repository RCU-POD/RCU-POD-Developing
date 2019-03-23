$("#slide").css("display", "none");
$(".gallery-container").css("display", "none");
$(".slide2").css("display", "none");
$(".graphic-container").css("display", "none");
$("#searchcoffe").css("display", "none");
$(".recommendCoffeContainer").css("display", "none");
$(".contact-sec").css("display", "none");
$("footer").css("display", "none");

$(document).ready(function(){
    $(".triangle-wel").on( "click", function() {
        $('.welcome').slideUp("slow",function(){
            
        });
<<<<<<< HEAD
        $('#slide').show(); 
=======
        $('#slide').fadeIn(1200); 
>>>>>>> e7cf553e32eefcd7daa00072b27cf3f81fafff7f
        $('.slide2').show();
        $('.graphic-container').show();  
        $('.gallery-container').show();
        $('#searchcoffe').show();
        $('.recommendCoffeContainer').show();
        $('.contact-sec').show();
        $('footer').show();
    });
});