/* 
* @Author: anchen
* @Date:   2016-03-27 20:42:46
* @Last Modified by:   anchen
* @Last Modified time: 2016-03-28 10:32:13
*/

$(document).ready(function(){
    // 背景图片撑开
    var bodyHeight = $(window).height();
    $(".index-bg").css({
        "minHeight": bodyHeight
    });
    // 导航栏子部分
    $(".header-nav div").hover(function(){
        $(this).children('ul').css({
            "display":"block"
        });
        $(this).children('.nvajiantou').css({
            "display":"block"
        });
    }, function(){
        $(this).children('ul').css({
            "display":"none"
        });
        $(this).children('.nvajiantou').css({
            "display":"none"
        });
    })
});