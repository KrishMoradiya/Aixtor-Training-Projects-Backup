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
	if(name.value === ''){
		document.getElementById('nameValidationEdit').innerText = 'Please enter a name';
        return false;
	}
	if(email.value === ''){
		document.getElementById('emailValidationEdit').innerText = 'Please enter a email';
		return false
	}
	if(password.value === ''){
		document.getElementById('passwordValidationEdit').innerText = 'Please enter a password';
		return false
	}
	if(mobile.value === ''){
		document.getElementById('mobileValidationEdit').innerText = 'Please enter a mobile';
		return false
	}
	{
		document.getElementsByClassName('error-text').innerText = ''		
	}
	
}

function registerFormValidation(){
	let registerForm = document.registerForm;
	let name = registerForm.name;
	let email = registerForm.email;
	let password = registerForm.password;
	let gender = registerForm.gender;
	let mobile = registerForm.mobile;
	if(name.value === ''){
		document.getElementById('nameValidation').innerText = 'Please enter a name';
        return false;
	}
	if(email.value === ''){
		document.getElementById('emailValidation').innerText = 'Please enter a email';
		return false
	}
	if(password.value === ''){
		document.getElementById('passwordValidation').innerText = 'Please enter a password';
		return false
	}
	if(mobile.value === ''){
		document.getElementById('mobileValidation').innerText = 'Please enter a mobile';
		return false
	}
	{
		document.getElementsByClassName('error-text').innerText = ''		
	}
}