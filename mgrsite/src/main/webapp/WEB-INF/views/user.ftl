<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>蓝源Eloan-P2P平台->我要借款</title>
<#include "common/header.ftl"/>
    <script type="text/javascript" src="/js/plugins/jquery.twbsPagination.min.js"></script>
    <script type="text/javascript" src="/js/plugins/jquery.form.js"></script>
    <script type="text/javascript" src="/js/plugins-override.js"></script>
    <script type="text/javascript">
        $(function () {
            var searchForm = $("#searchForm");
            var gridBody = $("#gridBody");
            searchForm.ajaxForm(function (data) {
                gridBody.hide();
                gridBody.html(data);
                gridBody.show(500);
            });
            searchForm.submit();

            $("input[name=bidRequestState]").change(function () {
                $("#currentPage").val(1);
                searchForm.submit();
            });
        });
    </script>
</head>
<body>
<!-- 网页头信息 -->
<#assign currentNav="user" />
<!-- 网页导航 -->
<#include "common/top.ftl"/>

<!-- 网页内容 -->
<div class="container" style="min-height: 500px;">
    <div class="row">
        <!--导航菜单-->
        <div class="col-sm-3">
        <#assign currentMenu="user"/>
		    <#include "common/menu.ftl" />
        </div>
        <!-- 功能页面 -->
        <div class="col-sm-9">
            <form action="/user_list.do" name="searchForm" id="searchForm" class="form-inline" method="post">
                <input type="hidden" name="currentPage" id="currentPage" value="1">
                <div class="form-group">
                    <input type="text" class="form-control" name="username" placeholder="用户名称"/>
                </div>
                <div class="form-group">
                    <label>会员等级</label>
                    <select class="form-control" name="grade" id="grade">
                        <option value="-1">全部</option>
                        <option value="1">1级</option>
                        <option value="2">2级</option>
                        <option value="3">3级</option>
                    </select>
                </div>
                <div class="form-group">
                    <label>积分范围</label>
                    <input type="text" style="width: 80px" name="beginScore" /> ->
                </div>
                <div class="form-group">
                    <input type="text" style="width: 80px" name="endScore" />
                </div>
                <div class="form-group">
                    <button type="button" id="query" class="btn btn-success"><i class="icon-search"></i>搜索</button>
                </div>
            </form>
            <table class="table el-table table-hover">
                <thead id="gridHead">
                <tr>
                    <th>会员编号</th>
                    <th width="80px">用户名</th>
                    <th>邮箱</th>
                    <th>注册时间</th>
                    <th>有效订单数</th>
                    <th>总订单金额</th>
                    <th>平台账户余额</th>
                    <th>用户等级</th>
                    <th>用户积分</th>
                    <th width="80px">操作</th>
                </tr>
                </thead>
                <tbody id="gridBody">

                </tbody>
            </table>
            <div style="text-align: center;">
                <ul id="pagination" class="pagination"></ul>
            </div>
        </div>
    </div>
    <!-- 网页版权 -->
</body>
</html>