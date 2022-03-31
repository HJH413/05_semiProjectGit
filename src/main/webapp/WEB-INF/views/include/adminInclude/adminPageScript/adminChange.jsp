<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="false"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script>
$(document).ready(function(){
    $("#boardUpdateButton").click(function(){
        // 확인 대화상자    
        if(confirm("수정하시겠습니까?")){
            document.formBoard.action = "adminBoardUpdate.do";
            document.formBoard.submit();
        }
    });
});
$(document).ready(function(){
    $("#boardDeleteButton").click(function(){
        // 확인 대화상자 
        if(confirm("삭제하시겠습니까?")){
            document.formBoard.action = "adminBoardDelete.do";
            document.formBoard.submit();
        }
    });
});
</script>
<script>
var is_empty = false;
$('#boardForm').find('input[type!="hidden"]').each(function(){
    if(!$(this).val()) {
        is_empty = true;
    }
});
 
if(is_empty) {
    alert('값을 전부 입력하시오');
}
</script>