/*Author: QuiNV
Date: 2016/11/24*/

$(document).ready(function() {

	// Create effect for show item
	new WOW().init();
	
	/*Change tab*/
	$('ul.tabs li').click(function() {
		var tab_id = $(this).attr('data-tab');

		$('ul.tabs li').removeClass('current');
		$('.tab-content').removeClass('current');

		$(this).addClass('current');
		$("#" + tab_id).addClass('current');
	})

	/*Silder*/
	$('#slider-news').tinycarousel({
		axis : 'x'
	});

})