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

/* Código Saulo Modal */
var setStarsModal = function(star)
{
	var $star_rating_modal = $('#startsContainerRate .fa');
	
	$star_rating_modal.each(function(i, value) {
		if( parseInt($(value).attr("data-rating")) <= star ){
            $(this).removeClass('fa-star').addClass('fa-star starSelected');
       }else{
           $(this).removeClass('fa-star starSelected').addClass('fa-star');
       }
	});
}

$("#star1Rate").click(function(){
    setStarsModal(1);
    setStarsCali(1);
});

$("#star2Rate").click(function(){
    setStarsModal(2);
    setStarsCali(2);
});

$("#star3Rate").click(function(){
    setStarsModal(3);
    setStarsCali(3);
});
$("#star4Rate").click(function(){
    setStarsModal(4);
    setStarsCali(4);
});
$("#star5Rate").click(function(){
    setStarsModal(5);
    setStarsCali(5);
});

var setStarsCali = function(star)
{
	var $star_rating_modal = $('#starsContainerCali .fa');
	
	$star_rating_modal.each(function(i, value) {
		if( parseInt($(value).attr("data-rating")) <= star ){
            $(this).removeClass('fa-star').addClass('fa-star starSelected');
       }else{
           $(this).removeClass('fa-star starSelected').addClass('fa-star');
       }
	});
}

$("#star1Cali").click(function(){
    setStarsCali(1);
    setStarsModal(1);
});

$("#star2Cali").click(function(){
    setStarsCali(2);
    setStarsModal(2);
});

$("#star3Cali").click(function(){
    setStarsCali(3);
    setStarsModal(3);
});
$("#star4Cali").click(function(){
    setStarsCali(4);
    setStarsModal(4);
});
$("#star5Cali").click(function(){
    setStarsCali(5);
    setStarsModal(5);
});
/* Fin Código Saulo Modal */