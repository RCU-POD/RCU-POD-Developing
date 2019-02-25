var setStars = function(star){
    
    var $star_rating = $('.starsContainer .fa');
    
    $star_rating.each(function(i,value) {
        if( parseInt($(value).attr("data-rating")) <= star ){
             $(this).removeClass('fa-star').addClass('fa-star starSelected');
        }else{
            $(this).removeClass('fa-star starSelected').addClass('fa-star');
        }
    });
    $('#starsCount').val(star);
}

$("#star1").click(function(){
    setStars(1);
});

$("#star2").click(function(){
    setStars(2);
});

$("#star3").click(function(){
    setStars(3);
});
$("#star4").click(function(){
    setStars(4);
});
$("#star5").click(function(){
    setStars(5);
});
