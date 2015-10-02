$(document).ready(function(){
		//classes must include hashtags
		$("#one").click(function(){
			console.log("one is clicked");

				//this jquery manipulates css class sketch to hide
				$("#firstsketch").removeClass("hidden");
				$("#secondsketch").addClass("hidden");
				$("#thirdsketch").addClass("hidden");
				$("#fourthsketch").addClass("hidden");
				//this jquery manipulates css class to update .selected to change color
				$("#one").addClass("selected");
				$("#two").removeClass("selected");
				$("#three").removeClass("selected");
				$("#four").removeClass("selected");
		});
		$("#two").click(function(){
			console.log("two is clicked");
				$("#firstsketch").addClass("hidden");
				$("#secondsketch").removeClass("hidden");
				$("#thirdsketch").addClass("hidden");
				$("#fourthsketch").addClass("hidden");
				
				$("#one").removeClass("selected");
				$("#two").addClass("selected");
				$("#three").removeClass("selected");
				$("#four").removeClass("selected");
		});
		$("#three").click(function(){
			console.log("three is clicked");
				$("#firstsketch").addClass("hidden");
				$("#secondsketch").addClass("hidden");
				$("#thirdsketch").removeClass("hidden");
				$("#fourthsketch").addClass("hidden");

				$("#one").removeClass("selected");
				$("#two").removeClass("selected");
				$("#three").addClass("selected");
				$("#four").removeClass("selected");
		});
		$("#four").click(function(){
			console.log("three is clicked");
				$("#firstsketch").addClass("hidden");
				$("#secondsketch").addClass("hidden");
				$("#thirdsketch").addClass("hidden");
				$("#fourthsketch").removeClass("hidden");

				$("#one").removeClass("selected");
				$("#two").removeClass("selected");
				$("#three").removeClass("selected");
				$("#four").addClass("selected");
		});


})