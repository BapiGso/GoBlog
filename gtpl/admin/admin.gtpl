
<!DOCTYPE HTML>
<html>
    <head>
        <meta charset="UTF-8">
        <meta name="renderer" content="webkit">
        <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no">
        <title>  Powered by Typecho</title>
        <meta name="robots" content="noindex, nofollow">
        <link rel="stylesheet" href="https://www.mihoyo.ltd/admin/css/normalize.css?v=1.2.0">
<link rel="stylesheet" href="https://www.mihoyo.ltd/admin/css/grid.css?v=1.2.0">
<link rel="stylesheet" href="https://www.mihoyo.ltd/admin/css/style.css?v=1.2.0">    </head>
    <body>
<div class="typecho-head-nav clearfix" role="navigation">
    <button class="menu-bar">菜单</button>
    <nav id="typecho-nav-list">
        <ul class="root focus"><li class="parent"><a href="https://www.mihoyo.ltd/admin/index.php">控制台</a></li><ul class="child"><li class="focus"><a href="https://www.mihoyo.ltd/admin">概要</a></li><li><a href="https://www.mihoyo.ltd/admin/profile.php">个人设置</a></li><li><a href="https://www.mihoyo.ltd/admin/plugins.php">插件</a></li><li><a href="https://www.mihoyo.ltd/admin/themes.php">外观</a></li><li><a href="https://www.mihoyo.ltd/admin/backup.php">备份</a></li><li><a href="https://www.mihoyo.ltd/admin/extending.php?panel=Access%2Fpage%2Fconsole.php">Access控制台</a></li><li class="last"><a href="https://www.mihoyo.ltd/admin/extending.php?panel=CommentNotifier%2Fconsole.php">评论邮件提醒</a></li></ul></ul><ul class="root"><li class="parent"><a href="https://www.mihoyo.ltd/admin/write-post.php">撰写</a></li><ul class="child"><li><a href="https://www.mihoyo.ltd/admin/write-post.php">撰写文章</a></li><li class="last"><a href="https://www.mihoyo.ltd/admin/write-page.php">创建页面</a></li></ul></ul><ul class="root"><li class="parent"><a href="https://www.mihoyo.ltd/admin/manage-posts.php">管理</a></li><ul class="child"><li><a href="https://www.mihoyo.ltd/admin/manage-posts.php">文章</a></li><li><a href="https://www.mihoyo.ltd/admin/manage-pages.php">独立页面</a></li><li><a href="https://www.mihoyo.ltd/admin/manage-comments.php">评论</a></li><li><a href="https://www.mihoyo.ltd/admin/manage-categories.php">分类</a></li><li><a href="https://www.mihoyo.ltd/admin/manage-tags.php">标签</a></li><li><a href="https://www.mihoyo.ltd/admin/manage-medias.php">文件</a></li><li class="last"><a href="https://www.mihoyo.ltd/admin/manage-users.php">用户</a></li></ul></ul><ul class="root"><li class="parent"><a href="https://www.mihoyo.ltd/admin/options-general.php">设置</a></li><ul class="child"><li><a href="https://www.mihoyo.ltd/admin/options-general.php">基本</a></li><li><a href="https://www.mihoyo.ltd/admin/options-discussion.php">评论</a></li><li><a href="https://www.mihoyo.ltd/admin/options-reading.php">阅读</a></li><li class="last"><a href="https://www.mihoyo.ltd/admin/options-permalink.php">永久链接</a></li></ul></ul>    </nav>
    <div class="operate">
    </div>
</div>

<div class="main">
    <div class="container typecho-dashboard">
        <div class="typecho-page-title">
    <h2></h2>
</div>
        <div class="row typecho-page-main">
            <div class="col-mb-12 welcome-board" role="main">

                <ul id="start-link" class="clearfix">
                                            <li><a href="https://www.mihoyo.ltd/admin/write-post.php">撰写新文章</a></li>
                                                                                                    <li><a href="https://www.mihoyo.ltd/admin/themes.php">更换外观</a></li>
                            <li><a href="https://www.mihoyo.ltd/admin/plugins.php">插件管理</a></li>
                            <li><a href="https://www.mihoyo.ltd/admin/options-general.php">系统设置</a>
                            </li>

                </ul>
            </div>

            <div class="col-mb-12 col-tb-4" role="complementary">
                <section class="latest-link">
                    <h3>最近发布的文章</h3>

                </section>
            </div>

            <div class="col-mb-12 col-tb-4" role="complementary">
                <section class="latest-link">
                    <h3>最近得到的回复</h3>

                </section>
            </div>

            <div class="col-mb-12 col-tb-4" role="complementary">
                <section class="latest-link">
                    <h3>官方最新日志</h3>
                    <div id="typecho-message">
                        <ul>
                            <li>读取中...</li>
                        </ul>
                    </div>
                </section>
            </div>
        </div>
    </div>
</div>

<div class="typecho-foot" role="contentinfo">
    <div class="copyright">
        <a href="http://typecho.org" class="i-logo-s">Typecho</a>
        <p>由 <a href="http://typecho.org">Typecho</a> 强力驱动, 版本 1.2.0</p>
    </div>
    <nav class="resource">
        <a href="http://docs.typecho.org">帮助文档</a> &bull;
        <a href="http://forum.typecho.org">支持论坛</a> &bull;
        <a href="https://github.com/typecho/typecho/issues">报告错误</a> &bull;
        <a href="http://typecho.org/download">资源下载</a>
    </nav>
</div>
<script src="https://www.mihoyo.ltd/admin/js/jquery.js?v=1.2.0"></script>
<script src="https://www.mihoyo.ltd/admin/js/jquery-ui.js?v=1.2.0"></script>
<script src="https://www.mihoyo.ltd/admin/js/typecho.js?v=1.2.0"></script>
<script>
    (function () {
        $(document).ready(function() {
            // 处理消息机制
            (function () {
                var prefix = '8c6ecd741a093d4bb31c532dc1045ced',
                    cookies = {
                        notice      :   $.cookie(prefix + '__typecho_notice'),
                        noticeType  :   $.cookie(prefix + '__typecho_notice_type'),
                        highlight   :   $.cookie(prefix + '__typecho_notice_highlight')
                    },
                    path = '/';

                if (!!cookies.notice && 'success|notice|error'.indexOf(cookies.noticeType) >= 0) {
                    var head = $('.typecho-head-nav'),
                        p = $('<div class="message popup ' + cookies.noticeType + '">'
                        + '<ul><li>' + $.parseJSON(cookies.notice).join('</li><li>') 
                        + '</li></ul></div>'), offset = 0;

                    if (head.length > 0) {
                        p.insertAfter(head);
                        offset = head.outerHeight();
                    } else {
                        p.prependTo(document.body);
                    }

                    function checkScroll () {
                        if ($(window).scrollTop() >= offset) {
                            p.css({
                                'position'  :   'fixed',
                                'top'       :   0
                            });
                        } else {
                            p.css({
                                'position'  :   'absolute',
                                'top'       :   offset
                            });
                        }
                    }

                    $(window).scroll(function () {
                        checkScroll();
                    });

                    checkScroll();

                    p.slideDown(function () {
                        var t = $(this), color = '#C6D880';
                        
                        if (t.hasClass('error')) {
                            color = '#FBC2C4';
                        } else if (t.hasClass('notice')) {
                            color = '#FFD324';
                        }

                        t.effect('highlight', {color : color})
                            .delay(5000).fadeOut(function () {
                            $(this).remove();
                        });
                    });

                    
                    $.cookie(prefix + '__typecho_notice', null, {path : path});
                    $.cookie(prefix + '__typecho_notice_type', null, {path : path});
                }

                if (cookies.highlight) {
                    $('#' + cookies.highlight).effect('highlight', 1000);
                    $.cookie(prefix + '__typecho_notice_highlight', null, {path : path});
                }
            })();


            // 导航菜单 tab 聚焦时展开下拉菜单
            const menuBar = $('.menu-bar').click(function () {
                const nav = $(this).next('#typecho-nav-list');
                if (!$(this).toggleClass('focus').hasClass('focus')) {
                    nav.removeClass('expanded noexpanded');
                }
            });

            $('.main, .typecho-foot').on('click touchstart', function () {
                if (menuBar.hasClass('focus')) {
                    menuBar.trigger('click');
                }
            });

            $('#typecho-nav-list ul.root').each(function () {
                const ul = $(this), nav = ul.parent();

                ul.on('click touchend', '.parent a', function (e) {
                    nav.removeClass('noexpanded').addClass('expanded');
                    if ($(window).width() < 576 && e.type == 'click') {
                        return false;
                    }
                }).find('.child')
                .append($('<li class="return"><a>返回</a></li>').click(function () {
                    nav.removeClass('expanded').addClass('noexpanded');
                    return false;
                }));
            });

            if ($('.typecho-login').length == 0) {
                $('a').each(function () {
                    var t = $(this), href = t.attr('href');

                    if ((href && href[0] == '#')
                        || /^https\:\/\/www.mihoyo.ltd\/admin\/.*$/.exec(href)
                            || /^https\:\/\/www.mihoyo.ltd\/action\/[_a-zA-Z0-9\/]+.*$/.exec(href)) {
                        return;
                    }

                    t.attr('target', '_blank')
                        .attr('rel', 'noopener noreferrer');
                });
            }

            $('.main form').submit(function () {
                $('button[type=submit]', this).attr('disabled', 'disabled');
            });
        });
    })();
</script>

<script>
    $(document).ready(function () {
        var ul = $('#typecho-message ul'), cache = window.sessionStorage,
            html = cache ? cache.getItem('feed') : '',
            update = cache ? cache.getItem('update') : '';

        if (!!html) {
            ul.html(html);
        } else {
            html = '';
            $.get('https://www.mihoyo.ltd/action/ajax?do=feed', function (o) {
                for (var i = 0; i < o.length; i++) {
                    var item = o[i];
                    html += '<li><span>' + item.date + '</span> <a href="' + item.link + '" target="_blank">' + item.title
                        + '</a></li>';
                }

                ul.html(html);
                cache.setItem('feed', html);
            }, 'json');
        }

        function applyUpdate(update) {
            if (update.available) {
                $('<div class="update-check message error"><p>'
                    + '您当前使用的版本是 %s'.replace('%s', update.current) + '<br />'
                    + '<strong><a href="' + update.link + '" target="_blank">'
                    + '官方最新版本是 %s'.replace('%s', update.latest) + '</a></strong></p></div>')
                    .insertAfter('.typecho-page-title').effect('highlight');
            }
        }

        if (!!update) {
            applyUpdate($.parseJSON(update));
        } else {
            $.get('https://www.mihoyo.ltd/action/ajax?do=checkVersion', function (o, status, resp) {
                applyUpdate(o);
                cache.setItem('update', resp.responseText);
            }, 'json');
        }
    });

</script>
    </body>
</html>
<script>
$(document).ready(function() {
  $("#start-link").append("<li><a href=\"https://www.mihoyo.ltd/admin/extending.php?panel=Access/page/console.php\">Access控制台</a></li>");
});
</script>