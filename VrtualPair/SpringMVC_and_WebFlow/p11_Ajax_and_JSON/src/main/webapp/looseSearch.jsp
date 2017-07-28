<html>
<head>
    <title>Loose Search</title>

    <script type="text/javascript" src="jquery-1.4.2.min.js"></script>

    <script type="text/javascript">
        function doSearch() {
            alert("Hello");
        }
    </script>

</head>

<body>

<h1>Loose Search</h1>

<input type="text" onKeyUp="doSearch();" id="searchBox"/>

<div id="results">
    Results will appear here...
</div>

</body>
</html>