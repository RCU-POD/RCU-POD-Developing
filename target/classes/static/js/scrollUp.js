(document).ready(function() {
    var offset=250;
    var duration = 2000;
  $(window).scroll(function(){
      if($(this).scrollTop()>offset){
          $('.to-top').fadeIn(duration);
      }else{
          $('.to-top').fadeIn(duration);
      }
    });
    $('.to-top').click(function(){
        $('body')
    })
});
