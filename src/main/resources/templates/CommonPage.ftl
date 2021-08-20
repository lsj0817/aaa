<!DOCTYPE html>
<a href="javascript:;" onclick="toPage(1)">首页</a>
<a href="javascript:;" onclick="toPage(${page.pageIndex-1})">上一页</a>
<input type="hidden" id="pageCount" value="${page.pageCount }">
<input type="text" size="1" id="go" value="${page.pageIndex}">  <input type="button" onclick="turnPage()" value="go">
<a href="javascript:void(0);" onclick="toPage(${page.pageIndex+1})" >下一页</a>
<a href="javascript:;" onclick="toPage(${page.pageCount })">尾页</a>
&emsp;当前${page.pageIndex }页/共${page.pageCount }页
&emsp;总共${page.totalCount }条