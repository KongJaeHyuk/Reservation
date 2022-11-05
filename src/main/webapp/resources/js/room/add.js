window.onload = function(){
	bind();
}

function bind(){
	document.querySelector("#btn_add").addEventListener("click", btn_add_click);
}

function btn_add_click(event){
/*
*/
//	event.preventDefault(); //  submit이나 <a> tag의 기본 기능의 동작 취소
	let addForm = document.querySelector("#addForm");
	
	let name = addForm.querySelector("#name").value;
	let price = addForm.querySelector("#price").value;
	let description = addForm.querySelector("#description").value;
	let thumbnail_path = addForm.querySelector("#thumbnail_path").value;
	let default_head = addForm.querySelector("#default_head").value;
	
	let room_info = {
		name: name,
		price: price,
		description: description,
		thumbnail_path: thumbnail_path,
		default_head: default_head,
	}
	
	console.log(JSON.stringify(room_info));
	
	let xhr = new XMLHttpRequest();
	xhr.open("POST", "/room/api/room");
	xhr.setRequestHeader("Content-Type", "application/json; charset=UTF-8");
	xhr.send(JSON.stringify(room_info));
	xhr.onload = function(){
		console.log("xhr.response", xhr.response);
	}
}












