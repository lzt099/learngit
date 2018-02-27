<#if pageResult.result?size &gt; 0 >
    <#list pageResult.result as data>
    <tr>
        <td>${data.creatTime?string("yyyy-MM-dd HH:mm:SS")}</td>
        <td>${data.productId}</td>
        <td><a class="btn btn-danger btn-sm"
               href="/showProduct.do?productId=${data.productId}">查看商品</a></td>
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