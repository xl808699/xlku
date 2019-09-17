<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="static/js/jquery-1.8.3.min.js"></script>
<script type="text/javascript">
	$(function(){
		$('#uname').blur(function(){
			$.post('ajax.action',{uname:$(this).val()},
				function(data){
					alert(data);
			});
		});
		
		$('button').click(function(){
			
			$.post('json.action',
					{username:$('#uname').val(),password:'123',bornDate:new Date()},
					function(r){
						alert(r);
						//alert(r.username+':'+r.password+':'+r.bornDate);
				},'json');
		});
	})
</script>
</head>
<body>

<button>json</button>

<h2>注入多VO</h2>
<form action="form1.action" method="post" enctype="application/x-www-form-urlencoded">
	<table>
		<tr>
			<td>用户名：</td>
			<td><input name="username" id="uname"/></td>
		</tr>
		<tr>
			<td>密码：</td>
			<td><input name="password" type="password"/></td>
		</tr>
		<tr>
			<td>出生日期：</td>
			<td><input name="bornDate"/></td>
		</tr>
		<tr>
			<td>班级编号：</td>
			<td><input name="cid" /></td>
		</tr>
		<tr>
			<td>班级名：</td>
			<td><input name="username"/></td>
		</tr>
		<tr>
			<td><input type="image" src="static/images/login.gif"/></td>
			<td><input type="submit" value="提交" /></td>
		</tr>
	</table>
</form>

<h2>注入数组|集合</h2>
<form action="form2.action" method="post">
	<table>
		<tr>
			<td>用户名1：</td>
			<td><input name="username"/></td>
		</tr>		
		<tr>
			<td>用户名2：</td>
			<td><input name="username"/></td>
		</tr>
		<tr>
			<td></td>
			<td><input type="submit" value="提交" /></td>
		</tr>
	</table>
</form>

<h2>注入自定义泛型集合</h2>
<form action="form3.action" method="post">
	<table>
		<tr>
			<td>用户名1：</td>
			<td><input name="list[0].username"/></td>
		</tr>		
		<tr>
			<td>密码1：</td>
			<td><input name="list[0].password" type="password"/></td>
		</tr>
		<tr>
			<td>用户名2：</td>
			<td><input name="list[1].username"/></td>
		</tr>
		<tr>
			<td>密码2：</td>
			<td><input name="list[1].password" type="password"/></td>
		</tr>
		<tr>
			<td></td>
			<td><input type="submit" value="提交" /></td>
		</tr>
	</table>
</form>

<h2>注入Map</h2>
<form action="form4.action" method="post">
	<table>
		<tr>
			<td>用户名：</td>
			<td><input name="username"/></td>
		</tr>
		<tr>
			<td>密码：</td>
			<td><input name="password" type="password"/></td>
		</tr>		
		<tr>
			<td>班级名：</td>
			<td><input name="username"/></td>
		</tr>
		<tr>
			<td></td>
			<td><input type="submit" value="提交" /></td>
		</tr>
	</table>
</form>
</body>
</html>