<#if pageResult.result?size &gt; 0 >
    <#list pageResult.result as data>
    <tr>
        <td>${data.id }</td>
        <td><a href="user_detail.do?userId=${data.id}">${data.username}</a></td>
        <td class="text-info">${data.email}</td>
        <td>${data.registrationTime?string("yyyy-MM-dd HH:mm:SS")}</td>
        <td>${data.orderNumber }</td>
        <td>${data.totalAmount }</td>
        <td>${data.useableAmount }</td>
        <td>${data.grade }</td>
        <td>${data.score }</td>
        <td><a class="btn btn-danger btn-sm"
               href="/resetPassword.do?userId=${data.id}">重置密码</a></td>
    </tr>
    </#list>
<#else>
<tr>
    <td colspan="7" align="center">
        <p class="text-danger">目前没有符合要求的标</p>
    </td>
</tr>
</#if>

<script type="text/javascript">
    $(function () {
        $("#page_container").empty().append($('<ul id="pagination" class="pagination"></ul>'));
        $("#pagination").twbsPagination({
            totalPages:${pageResult.totalPage},
            currentPage:${pageResult.currentPage},
            initiateStartPageClick: false,
            onPageClick: function (event, page) {
                $("#currentPage").val(page);
                $("#searchForm").submit();
            }
        });
    });
</script>