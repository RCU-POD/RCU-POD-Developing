


$(document).ready(function () {




  var navbar = document.getElementById("navbar");
  var sticky = navbar.offsetTop;
  var menu = document.querySelector('.bg-nav')
  var menuPosition = menu.getBoundingClientRect().top;
  var flag = 0;
  var menu = document.querySelector('.bg-nav')
  var ul = document.querySelector('.menu-table')
  var hamburger = document.querySelector('.ham')
  window.addEventListener('scroll', function () {

    if (window.pageYOffset >= sticky) {
      menu.style.position = 'fixed';
      menu.style.top = '0px';
      flag=1;
      if (window.matchMedia("(min-width: 1200px)").matches) {

      } else {
        menu.style.backgroundColor = '';
      }



    } else {
      menu.style.position = 'static';
      menu.style.top = '';
      menu.style.backgroundColor = '#9f6138';
      if (window.matchMedia("(min-width: 1200px)").matches) {
        ul.style.visibility = 'visible';
        hamburger.style.visibility = 'hidden';
      } else {
        ul.style.visibility = 'hidden';
        hamburger.style.visibility = 'visible';
      }




    }
  });

  //var menu = document.querySelector('.bg-nav')
  //var ul = document.querySelector('.menu-table')
  //var hamburger =document.querySelector('a.ham')
  $(window).bind('mousewheel', function (event) {
    if (window.matchMedia("(min-width: 1200px)").matches) {
      if (event.originalEvent.wheelDelta >= 0) {
        hamburger.style.visibility = 'hidden';
        ul.style.visibility = 'visible';
        menu.style.backgroundColor = '#9f6138';


      } else {
        if (flag == 1) {
          ul.style.visibility = 'hidden';
          menu.style.backgroundColor = '';
          hamburger.style.visibility = 'visible';
        }
      }
    }
  });

  $('.nav-button').click(function () {
    $('body').toggleClass('nav-open');
  });
  $('.control').click(function () {
    $('body').toggleClass('nav-open');
  });

  $('a[href^="#"]').click(function () {
    var destino = $(this.hash);
    if (destino.length == 0) {
      destino = $('section[id="' + this.hash.substr(1) + '"]');
    }
    if (destino.length == 0) {
      destino = $('html');
    }
    $('html, body').animate({ scrollTop: destino.offset().top }, 500);
    return false;
  });
});


