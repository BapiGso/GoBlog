    <div id="screen">
        <div id="mark">
            <div class="layer" data-depth="0.4">
                <img id="cover" crossorigin="anonymous" src="https://www.mihoyo.ltd/Background/post0/wallhaven-672007-1.png" width="2500" height="1637" alt="illustration">
            </div>
        </div>

        <div id="vibrant">
            <svg viewBox="0 0 2880 1620" height="100%" preserveAspectRatio="xMaxYMax slice">
                <polygon opacity="0.7" points="2000,1620 0,1620 0,0 600,0 "/>
            </svg>
            <div></div>
        </div>

        <div id="header">
            <div>
                <a class="image-logo" href="https://www.mihoyo.ltd/"></a>
                <div class="icon-menu switchmenu"></div>
            </div>
        </div>

        <div id="post0">
            <p>{{ .created }}</p>
            <h2><a data-id="{{ .slug }}" class="posttitle" href="./archives/{{ .slug }}">{{ .title }}</a></h2>
            <div class="summary"><p>{{ .subcount }}...</p></div>
        </div>