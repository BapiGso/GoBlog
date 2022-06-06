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

<div id="single" data-id="150">
    <div id="top">
        <div class="bar"></div>
        <a class="image-icon" href="javascript:history.back()"></a>
        <div title="播放/暂停" data-id="150" class="icon-play"></div>
		<h3 class="subtitle">{{ .title }}</h3>
        <div class="social">
            <div class="like-icon">
                <a href="javascript:;" class="likeThis" id="like-150"><span class="icon-like"></span><span class="count likeNum">0</span>
                </a>
            </div>
            <div>
                <div class="share">
                    <a title="获取二维码" class="icon-wechat" href="javascript:;"></a>
                </div>
                <div id="qr">
                </div>
            </div>
        </div>
        <div class="scrollbar"></div>
    </div>

    <div class="section" style="left: 0;">
        <!--<div class="images"></div>-->
        <div class="article">
            <div>
        		<h1 class="title">{{ .title }}</h1>

                <div class="stuff">
                    <span>{{ .created }}</span>
                    <span>阅读 <span id="readNum">{{ .views }}</span></span>
                    <span>字数 <span id="wordNum">{{ .count }}</span></span>
                    <span>喜欢 <span class="icon-like"></span><span class="count likeNum">{{ .likes }}</span></span>
                </div>

                <div class="content">{{ .text }}</div>
                <div class="comment-wrap">

<div id="respond-post-150" class="comment-respond">
    <h2 id="reply-title" class="comment-reply-title">
        发表评论

    </h2>
    <form action="archives/150/comment" method="post" id="commentform" class="comment-form">
        <p class="comment-form-comment">
            <label for="comment">评论</label>
            <textarea id="textarea" name="text" cols="45" rows="8" maxlength="65525" required="required"></textarea>
        </p>
                    <div class="logged-in-as">

            </div>
                <p class="form-submit">
            <input type="submit" class="submit" data-now="刚刚" data-init="提交评论" data-posting="提交评论中..." data-posted="评论提交成功" data-empty-comment="必须填写评论内容" id="submit" value="发表评论">
        </p>
    </form>
</div>


    </div>
            <audio id="audio-150-1" preload="auto" controls="controls">
            <source type="audio/mpeg" src="https://music.163.com/song/media/outer/url?id=486194382.mp3">
        </audio>
    </div>

            {{- if .noheadfoot}}{{template "footer.html"}}{{- end}}
        </body>
</html>
