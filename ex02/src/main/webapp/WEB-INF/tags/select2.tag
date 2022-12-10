<%@ tag language="java" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<select name="departmentId">
	<option value=""> :::선택:::
	<option value="10" <c:if test="${departmentId=='10'}">seleted</c:if> > Administration
	<option value="20" <c:if test="${departmentId=='20'}">seleted</c:if> > Marketing
	<option value="50" <c:if test="${departmentId=='50'}">seleted</c:if> > Shipping
	<option value="60" <c:if test="${departmentId=='60'}">seleted</c:if> > IT
	<option value="80" <c:if test="${departmentId=='80'}">seleted</c:if> > Sales
</select>
<script>
	searchFrm.departmentId.value = ${empVO.departmentId }
</script>
