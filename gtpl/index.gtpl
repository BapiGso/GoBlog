{{- if .noheadfoot}}{{template "header.html"}}{{- end}}
    <body class="loading">
    <div id="loader"></div>
    <div class="nav">
        <ul id="menu-menu" class="menu">
            <li class="pview menu-item menu-item-type-post_type menu-item-object-page about">
    <a href="https://www.mihoyo.ltd/about" class="pviewa">Contact</a>
</li>
<li class="pview menu-item menu-item-type-post_type menu-item-object-page links">
    <a href="https://www.mihoyo.ltd/links" class="pviewa">Links</a>
</li>
<li class="pview menu-item menu-item-type-post_type menu-item-object-page archive">
    <a href="https://www.mihoyo.ltd/archive" class="pviewa">Archive</a>
</li>
<!--<li class="pview menu-item menu-item-type-post_type menu-item-object-page japonism">-->
<!--    <a href="https://www.mihoyo.ltd/japonism.html" class="pviewa">Japonism</a>-->
<!--</li>-->
<!--<li class="pview menu-item menu-item-type-post_type menu-item-object-page Q&A">-->
<!--    <a href="https:/www.zhihu.com/question/41625223/answer/103428945" class="pviewa">Q&A</a>-->
<!--</li>-->

            <li class="pview menu-item menu-item-type-post_type menu-item-object-page japonism">
                <a href="https://www.mihoyo.ltd/japonism.html" class="pviewa">Japonism</a>
            </li>
            <li class="pview menu-item menu-item-type-post_type menu-item-object-page Q&A">
                <a href="https://www.zhihu.com/question/41625223/answer/103428945" class="pviewa">Q&A</a>
            </li>
        </ul>
        <p>&copy; 2022 <a href="https://www.mihoyo.ltd/">素锦</a>. Proudly published with <a rel="external nofollow" href="https://typecho.org">Typecho</a>. Theme <a href="https://github.com/LoeiFy/Diaspora">Diaspora</a> Modified by <a href="https://jcl.moe">Jin</a>.</p>
    </div>

    <div id="container">
    {{ .container }}
    </div>

    <div id="primary">
    {{ .pyimary }}
    </div>

    <div id="pager">
    <a href="https://www.mihoyo.ltd/index.php/page/2/" data-url="https://www.mihoyo.ltd/index.php/page/2/" class="more">加载更多</a>
</div>
</div>
<div id="preview" class="trans"></div>

    {{- if .noheadfoot}}{{template "footer.html"}}{{- end}}
        </body>
</html>
