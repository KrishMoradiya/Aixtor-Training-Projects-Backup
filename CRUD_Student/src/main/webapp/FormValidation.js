function signInValidate(){
	let loginForm = document.loginForm;
	let username = loginForm.email;
	let password = loginForm.password;
	if(username.value == ""){
		alert("Enter Username...");
		username.focus();
		return false
	}
	if(password.value == ""){
		alert("Enter Password...");
		password.focus();
		return false
	}
}

function editFormValidation(){
	let editForm = document.editForm;
	let name = editForm.name;
	let email = editForm.email;
	let password = editForm.password;
	let gender = editForm.gender;
	let mobile = editForm.mobile;
	if(name.value == ""){
		alert("Enter Name...");
		username.focus();
		return false
	}
	if(email.value == ""){
		alert("Enter Email...");
		username.focus();
		return false
	}
	if(mobile.value == ""){
		alert("Enter Mobile Number...");
		username.focus();
		return false
	}
	if(gender.value == ""){
		alert("Enter Gender...");
		username.focus();
		return false
	}
	if(password.value == ""){
		alert("Enter Password...");
		username.focus();
		return false
	}
}

function registerFormValidation(){
	let registerForm = document.registerForm;
	let name = registerForm.name;
	let email = registerForm.email;
	let password = registerForm.password;
	let gender = registerForm.gender;
	let mobile = registerForm.mobile;
	if(name.value == ""){
		alert("Enter Name...");
		username.focus();
		return false
	}
	if(email.value == ""){
		alert("Enter Email...");
		username.focus();
		return false
	}
	if(gender.value == ""){
		alert("Enter Gender...");
		username.focus();
		return false
	}
	if(password.value == ""){
		alert("Enter Password...");
		username.focus();
		return false
	}
	if(mobile.value == ""){
		alert("Enter Mobile Number...");
		username.focus();
		return false
	}
	window.Location("Register");
}