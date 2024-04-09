
//Trigger Owl Carousel(Blog)
$(document).ready(function(){
    $('.owl-carousel').owlCarousel({
      loop:true,
      margin:15,
      nav:true,
      navText:["<i class='fa fa-chevron-left'></i>","<i class='fa fa-chevron-right'></i>"],
      autoplay:true,
      autoplayTimeout:1500,
      autoplayHoverPause:true,
      responsiveClass:true,
      responsive:{
          0:{
              items:1,
  
          },
          768:{
              items:2,
  
          },
          992:{
              item:3
          }
      }
  });
//Trigger Owl Carousel(Why choose drivill)
  $('#why-choose-carousel').owlCarousel({
    responsiveClass:true,
    item:4,
    autoplay:true,
    autoplayTimeout:1000,
    autoplayHoverPause:true
  });
//Trigger Owl Carousel(Earn With Drivill)
  $('#earn-carousel').owlCarousel({
      responsiveClass:true,
      item:4,
      autoplay:true,
      autoplayTimeout:1000,
      autoplayHoverPause:true
  });

  });
  $( '.card h3' ).on( "click", function() {
    $( this ).find( 'span' ).toggleClass( "fa-angle-up fa-angle-right" );
  } );

 var leftScroller = document.querySelector(".scroller-left");
 var rightScroller = document.querySelector(".scroller-right");
 var scrollTab = document.querySelector("ul.list")
 leftScroller.addEventListener("click",function(){
    scrollTab.scrollLeft += -100; 
 })
 rightScroller.addEventListener("click",function(){
     scrollTab.scrollLeft += 100;
     scrollTab.getElementsByClassName.transition = "all 1s"
 })


 /*
    Stop / Start carousel autoplay
*/
$('.btn-customized').on('click', function(){
 
    if( ! $(this).hasClass('paused') ) {
        $('.carousel').carousel('pause');
        $('.btn-customized').toggleClass('paused');
        $('.btn-customized i').removeClass('fa-pause').addClass('fa-play');
        $(this).blur();
    }
    else {
        $('.carousel').carousel('cycle');
        $('.btn-customized').toggleClass('paused');
        $('.btn-customized i').removeClass('fa-play').addClass('fa-pause');
        $(this).blur();
    }
 
});


// Single post page sidebar height fixing
var singlePostImage = document.querySelector("single-feature-image").clientHeight;
var singlePostContent = document.querySelector("single-post-content").clientHeight
var x = document.querySelector("signle-post-sidebar ");
x.style.height = "500px";
console.log(singlePostImage)

