<%--
  Created by IntelliJ IDEA.
  User: cfy
  Date: 2018/7/30
  Time: 下午5:23
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%> <!--输出,条件,迭代标签库-->
<%--<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="fmt"%> <!--数据格式化标签库-->--%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="fn"%> <!--常用函数标签库-->
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="sql"%> <!--数据库相关标签库-->

<%@ page isELIgnored="false"%> <!--这个很重要！！！！！！不设的话，EL表达式不会解析-->
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>GPS!</title>
    <script src="../../js/echarts.js"></script>
</head>
<body>
<!-- 为ECharts准备一个具备大小（宽高）的Dom -->
<div id="main" style="width: 600px;height:400px;"></div>
<script type="text/javascript">
    // 基于准备好的dom，初始化echarts实例
    var myChart = echarts.init(document.getElementById('main'));

    // 指定图表的配置项和数据
    var option = {
        title: {
            text: 'ECharts 入门示例'
        },
        tooltip: {},
        legend: {
            data:['销量']
        },
        xAxis: {
            data: ["衬衫","羊毛衫","雪纺衫","裤子","高跟鞋","袜子"]
        },
        yAxis: {},
        series: [{
            name: '销量',
            type: 'bar',
            data: [5, 20, 36, 10, 10, 20]
        }]
    };

    // 使用刚指定的配置项和数据显示图表。
    myChart.setOption(option);
</script>
<div style="overflow: auto;height: 300px">
    <table class="table table-hover table-striped">
        <tbody>
        <tr class="info">
            <th>gpsid</th>
            <th>time</th>
            <th>longitude</th>
            <th>latitude</th>
            <th>bearing</th>
            <th>distance</th>
        </tr>
        <c:forEach items="${map}" var="p">
            <c:forEach items="${p.value}" var="q">
                <tr class="success">
                    <td>${q.gpsid}</td>
                    <td>${q.time}</td>
                    <td>${q.longitude}</td>
                    <td>${q.latitude}</td>
                    <td>${q.bearing}</td>
                    <td>${q.distance}</td>
                </tr>
            </c:forEach>
        </c:forEach>
        </tbody>

    </table>
</div>   <%--表格显示--%>
</body>
</html>
