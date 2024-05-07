/* Place your JavaScript in this file */

//Ensures that mobile cannot copy/paste words into
//Ensures that the input will always have a value
function forceAmount(changedItem){
    //confirm input type
    var currentItem = document.getElementById(changedItem);
    if(currentItem.tagName === "INPUT"){
        if(currentItem.value == '' || currentItem.value <= currentItem.min){
            currentItem.value = currentItem.min;
	    if(currentItem.min == ''){
		currentItem.value = 0;
	    }
        }
	
    }
}
