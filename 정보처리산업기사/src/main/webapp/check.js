function joinForm_check() {
	if(document.frm.custname.value.length=="") {
		alert ("이름을 입력하세요.");
		custname.focus();
		return false;
	}
	if(document.frm.phone.value.length=="") {
		alert ("번호를 입력하세요.");
		phone.focus();
		return false;
	}
	if(document.frm.address.value.length=="") {
		alert ("주소를 입력하세요.");
		address.focus();
		return false;
	}
	if(document.frm.date.value.length=="") {
		alert ("가입일자를 입력하세요.");
		date.focus();
		return false;
	}
	if(document.frm.grade.value.length=="") {
		alert ("등급을 입력하세요.");
		grade.focus();
		return false;
	}
	if(document.frm.city.value.length=="") {
		alert ("도시코드를 입력하세요.");
		city.focus();
		return false;
	}
	return true;
}