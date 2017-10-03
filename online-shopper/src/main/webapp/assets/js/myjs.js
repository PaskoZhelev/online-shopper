$(function(){
	// solve the active menu
	switch(menu){
	case 'About':
		$("#about").addClass("active");
		break;
	case 'Contact':
		$("#contact").addClass("active");
		break;
	case 'Products':
		$("#products").addClass("active");
		break;
	default:
		$("#home").addClass("active");
		break;
	
	}
	
});
