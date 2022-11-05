window.onload = function(){
	bind();
}

function bind(){
	document.querySelector("#btn_update").addEventListener("click", btn_update_click);
}

function btn_update_click(event){
	let addForm = document.querySelector("#addForm");
	
	let name = addForm.querySelector("#name").value;
	let price = addForm.querySelector("#price").value;
	let description = addForm.querySelector("#description").value;
	let thumbnail_path = addForm.querySelector("#thumbnail_path").value;
	let default_head = addForm.querySelector("#default_head").value;
	
	let room_id = event.target.getAttribute("data-room_id");
	
	let room_info = {
		name: name,
		price: price,
		description: description,
		thumbnail_path: thumbnail_path,
		default_head: default_head,
		room_id: room_id
	}
	
	console.log(JSON.stringify(room_info));
	
	let xhr = new XMLHttpRequest();
	xhr.open("PUT", "/room/api/room");
	xhr.setRequestHeader("Content-Type", "application/json; charset=UTF-8");
	xhr.send(JSON.stringify(room_info));
	xhr.onload = function(){
		if(xhr.response == 1){
			location.href = "/room/room/list.view";
		} else {
			alert("수정되지 않았습니다.");
		}
	}
}












