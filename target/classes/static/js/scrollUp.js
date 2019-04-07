jQuery(document).ready(function() {
    var offset=250;
    var duration = 2000;
    jQuery(window).scroll(function(){
      if(jQuery(this).scrollTop()>offset){
          jQuery('.to-top').fadeIn(duration);
      }else{
          jQuery('.to-top').fadeIn(duration);
      }
    });
    jQuery('.to-top').click(function(){
        jQuery('body')
    })
});
