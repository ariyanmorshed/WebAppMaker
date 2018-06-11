(function ($) {
 "use strict";

/*----------------------------
1. Full page Preloader
-----------------------------*/
    jQuery(window).on('load', function() {
      jQuery("#status").fadeOut();
      jQuery("#preloader").delay(350).fadeOut("slow");
    });


/*----------------------------
 2. Mobile Menu Activation
-----------------------------*/
    jQuery('.mobile-menu nav').meanmenu({
        meanScreenWidth: "991",
    });


/*--------------------------
 3. Sticky Menu 
---------------------------- */
	$(window).on('scroll', function(){
		if( $(window).scrollTop()>900 ){
			$('#sticky').addClass('sticky');
			} else {
			$('#sticky').removeClass('sticky');
		}
	});	

/*----------------------------
4. wow js active
------------------------------ */
	new WOW().init();
 
/*----------------------------
5. owl active
------------------------------ */  
	$("#owl-demo").owlCarousel({
		autoPlay: false, 
		slideSpeed:2000,
		pagination:false,
		navigation:true,	  
		items : 4,
		/* transitionStyle : "fade", */    /* [This code for animation ] */
		navigationText:["<i class='fa fa-angle-left'></i>","<i class='fa fa-angle-right'></i>"],
		itemsDesktop : [1199,4],
		itemsDesktopSmall : [980,3],
		itemsTablet: [768,2],
		itemsMobile : [479,1],
	});

/*--------------------------
6. jarallax active
---------------------------- */
	$('.jarallax').jarallax({
		speed: 0.5
	});

/*----------------------------
7. list grid view active
------------------------------ */
	//List Product
	$('#listview').on('click',function(event){
		event.preventDefault();
		$('#products .item').addClass('list-item');
	});

	//Grid Product
    $('#gridview').on('click',function(event){
    	event.preventDefault();
    	$('#products .item').removeClass('list-item');
    	$('#products .item').addClass('grid-item'); 
    });


/*--------------------------
8. Product cart added value
---------------------------- */	
	$(".vertical-spin").TouchSpin({
		verticalbuttons: true,
		verticalupclass: 'fa fa-plus',
		verticaldownclass: 'fa fa-minus'
	});

/*----------------------------
9. range-slider active
------------------------------ */  
	$( "#slider-range" ).slider({
		range: true,
		min: 40,
		max: 600,
		values: [ 60, 570 ],
		slide: function( event, ui ) {
			$( "#amount" ).val( "£" + ui.values[ 0 ] + " - £" + ui.values[ 1 ] );
		}
	});
	$( "#amount" ).val( "$" + $( "#slider-range" ).slider( "values", 0 ) +
	" - $" + $( "#slider-range" ).slider( "values", 1 ) );

/*----------------------------
10. isotope active
------------------------------ */     
	var $grid = $('.grid').isotope({
	    itemSelector: '.grid-item',
	    stagger: 30
	});

	$('.filter-demo').on( 'click', '.button', function() {
	    var filterValue = $(this).attr('data-filter');
	    $grid.isotope({ filter: filterValue });
	});

	// change is-checked class on buttons

	$('.filter').each( function( i, buttonGroup ) {
	    var $buttonGroup = $( buttonGroup );
	    $buttonGroup.on( 'click', '.button', function() {
	      $buttonGroup.find('.is-checked').removeClass('is-checked');
	      $( this ).addClass('is-checked');
	    });
	});

/*----------------------------
11. magnific Popup active
------------------------------ */
	$('.gallery').magnificPopup({
		delegate: 'a',
		type: 'image',
		closeOnContentClick: false,
		closeBtnInside: false,
		mainClass: 'mfp-with-zoom mfp-img-mobile',
		image: {
			verticalFit: true,
			titleSrc: function(item) {
				return item.el.attr('title') + ' &middot; <a class="image-source-link" href="'+item.el.attr('data-source')+'" target="_blank">image source</a>';
			}
		},
		gallery: {
			enabled: true
		},
		zoom: {
			enabled: true,
			duration: 300, // don't foget to change the duration also in CSS
			opener: function(element) {
				return element.find('img');
			}
		}
	});

/*--------------------------
12. Counter Animation
---------------------------- */
	var counterAnim = $('.counter-anim');
	if( counterAnim.length > 0 ){
		counterAnim.counterUp({ delay: 10,
        time: 1000});
	}
/*--------------------------
13. bxslider active
---------------------------- */   
	$('.bx-demo').bxSlider({
		pagerCustom: '.bx-thumb'
	});

/*--------------------------
14. scrollUp
---------------------------- */	
	$.scrollUp({
        scrollText: '<i class="fa fa-angle-up"></i>',
        easingType: 'linear',
        scrollSpeed: 900,
        animation: 'fade'
    }); 	   
 
})(jQuery); 