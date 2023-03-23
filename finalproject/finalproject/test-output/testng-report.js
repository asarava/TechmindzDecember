body {
    margin: 0 0 5px 5px;
}

ul {
    margin: 0;
}

li {
    list-style-type: none;
}

a {
    text-decoration: none;
}

a:hover {
    text-decoration: underline;
}

.navigator-selected {
    background: #ffa500;
}

.wrapper {
    position: absolute;
    top: 60px;
    bottom: 0;
    left: 400px;
    right: 0;
    overflow: auto;
}

.navigator-root {
    position: absolute;
    top: 60px;
    bottom: 0;
    left: 0;
    width: 400px;
    overflow-y: auto;
}

.suite {
    margin: 0 10px 10px 0;
    background-color: #fff8dc;
}

.suite-name {
    padding-left: 10px;
    font-size: 25px;
    font-family: Times, sans-serif;
}

.main-panel-header {
    padding: 5px;
    background-color: #9FB4D9; /*afeeee*/;
    font-family: monospace;
    font-size: 18px;
}

.main-panel-content {
    padding: 5px;
    margin-bottom: 10px;
    background-color: #DEE8FC; /*d0ffff*/;
}

.rounded-window {
    border-radius: 10px;
    border-style: solid;
    border-width: 1px;
}

.rounded-window-top {
    border-top-right-radius: 10px 10px;
    border-top-left-radius: 10px 10px;
    border-style: solid;
    border-width: 1px;
    overflow: auto;
}

.light-rounded-window-top {
    border-top-right-radius: 10px 10px;
    border-top-left-radius: 10px 10px;
}

.rounded-window-bottom {
    border-style: solid;
    border-width: 0 1px 1px 1px;
    border-bottom-right-radius: 10px 10px;
    border-bottom-left-radius: 10px 10px;
    overflow: auto;
}

.method-name {
    font-size: 12px;
    font-family: monospace;
}

.method-content {
    border-style: solid;
    border-width: 0 0 1px 0;
    margin-bottom: 10px;
    padding-bottom: 5px;
    width: 80%;
}

.parameters {
    font-size: 14px;
    font-family: monospace;
}

.stack-trace {
    white-space: pre;
    font-family: monospace;
    font-size: 12px;
    font-weight: bold;
    margin-top: 0;
    margin-left: 20px;
}

.testng-xml {
    font-family: monospace;
}

.method-list-content {
    margin-left: 10px;
}

.navigator-suite-content {
    margin-left: 10px;
    font: 12px 'Lucida Grande';
}

.suite-section-title {
    margin-top: 10px;
    width: 80%;
    border-style: solid;
    border-width: 1px 0 0 0;
    font-family: Times, sans-serif;
    font-size: 18px;
    font-weight: bold;
}

.suite-section-content {
    list-style-image: url(bullet_point.png);
}

.top-banner-root {
    position: absolute;
    top: 0;
    height: 45px;
    left: 0;
    right: 0;
    padding: 5px;
    margin: 0 0 5px 0;
    background-color: #0066ff;
    font-family: Times, sans-serif;
    color: #fff;
    text-align: center;
}
.button{
    position: absolute;
    margin-left:500px;
    margin-top:8px;
    background-color: white;
    color:#0066ff;
    font-family: "Helvetica Neue", Helvetica, Arial, sans-serif;
    font-weight:bold;
    border-color:#0066ff ;
    border-radius:25px;
    cursor: pointer;
    height:30px;
    width:150px;
    outline:none;

}

.top-banner-title-font {
    font-size: 25px;
}

.test-name {
    font-family: 'Lucida Grande', sans-serif;
    font-size: 16px;
}

.suite-icon {
    padding: 5px;
    float: right;
    height: 20px;
}

.test-group {
    font: 20px 'Lucida Grande';
    margin: 5px 5px 10px 5px;
    border-width: 0 0 1px 0;
    border-style: solid;
    padding: 5px;
}

.test-group-name {
    font-weight: bold;
}

.method-in-group {
    font-size: 16px;
    margin-left: 80px;
}

table.google-visualization-table-table {
    width: 100%;
}

.reporter-method-name {
    font-size: 14px;
    font-family: monospace;
}

.reporter-method-output-div {
    padding: 5px;
    margin: 0 0 5px 20px;
    font-size: 12px;
    font-family: monospace;
    border-width: 0 0 0 1px;
    border-style: solid;
}

.ignored-class-div {
    font-size: 14px;
    font-family: monospace;
}

.ignored-methods-div {
    padding: 5px;
    margin: 0 0 5px 20px;
    font-size: 12px;
    font-family: monospace;
    border-width: 0 0 0 1px;
    border-style: solid;
}

.border-failed {
    border-top-left-radius: 10px 10px;
    border-bottom-left-radius: 10px 10px;
    border-style: solid;
    border-width: 0 0 0 10px;
    border-color: #f00;
}

.border-skipped {
    border-top-left-radius: 10px 10px;
    border-bottom-left-radius: 10px 10px;
    border-style: solid;
    border-width: 0 0 0 10px;
    border-color: #edc600;
}

.border-passed {
    border-top-left-radius: 10px 10px;
    border-bottom-left-radius: 10px 10px;
    border-style: solid;
    border-width: 0 0 0 10px;
    border-color: #19f52d;
}

.times-div {
    text-align: center;
    padding: 5px;
}

.suite-total-time {
    font: 16px 'Lucida Grande';
}

.configuration-suite {
    margin-left: 20px;
}

.configuration-test {
    margin-left: 40px;
}

.configuration-class {
    margin-left: 60px;
}

.configuration-method {
    margin-left: 80px;
}

.test-method {
    margin-left: 100px;
}

.chronological-class {
    background-color: skyblue;
    border-style: solid;
    border-width: 0 0 1px 1px;
}

.method-start {
    float: right;
}

.chronological-class-name {
    padding: 0 0 0 5px;
    color: #008;
}

.after, .before, .test-method {
    font-family: monospace;
    font-size: 14px;
}

.navigator-suite-header {
    font-size: 22px;
    margin: 0 10px 5px 0;
    background-color: #deb887;
    text-align: center;
}

.collapse-all-icon {
    padding: 5px;
    float: right;
}