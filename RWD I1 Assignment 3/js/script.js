$("#fish1Id").ready(function () {
    animateDiv("#fish1Id");

});
$("#fish2Id").ready(function () {
    animateDiv("#fish2Id");

});
$("#fish1Id").dblclick(function(){
    grow("#fish1Id");
    
});
$("#fish2Id").mouseover(function () {

    randomMov("#fish2Id");
})
$("#bubble1Id").ready(function () {
    animateBubbl("#bubble1Id");
})
$("#bubble2Id").ready(function () {
    animateBubbl("#bubble2Id");
})
$("#bubble3Id").ready(function () {
    animateBubbl("#bubble3Id");
})
$("#bubble1Id").click(function () {
    $("#bubble1Id").stop().fadeOut(2000);
    $("#bubble1Id").show(10, function () {
        animateBubbl("#bubble1Id");
    });

});
$("#bubble2Id").click(function () {
    $("#bubble2Id").stop().fadeOut(2000);
    $("#bubble2Id").show(10, function () {
        animateBubbl("#bubble2Id");
    });

});
$("#bubble3Id").click(function () {
    $("#bubble3Id").stop().fadeOut(2000);
    $("#bubble3Id").show(10, function () {
        animateBubbl("#bubble3Id");
    });

});
$(document).click(function (e) {
    var mouseX = e.pageX - $("#fish1Id").width()/2;
    var mouseY = e.pageY - $("#fish1Id").height()/2;
    follow("#fish1Id", mouseX, mouseY);
});

// function

function makeNewPosition(IdRef) {


    var h = $(window).height() - $(IdRef).height();
    var w = $(window).width() - $(IdRef).width();
    var nh = Math.floor(Math.random() * h);
    var nw = Math.floor(Math.random() * w);

    return [nh, nw];

}

function animateDiv(IdRef2) {
    var newq = makeNewPosition(IdRef2);
    $(IdRef2).animate({
        top: newq[0],
        left: newq[1]
    }, 6000, function () {
        animateDiv(IdRef2);
    });

};

function animateBubbl(IdRef4) {
    var width = $(window).width() - $(IdRef4).width();
    var bx = Math.floor((Math.random() * width) + 1)
    var delay = 9000 + Math.floor(Math.random() * 10000);
    $(IdRef4).css("top", "100%");
    $(IdRef4).css("left", bx);
    $(IdRef4).animate({
        top: "-11%"
    }, delay, function () {
        animateBubbl(IdRef4);
    });
}

function randomMov(IdRef3) {
    var pos = makeNewPosition(IdRef3);
    $(IdRef3).stop().animate({
            top: pos[0] / 4,
            left: pos[1] / 4
        }, "slow",
        function () {
            animateDiv(IdRef3);
        });
}

function follow(IdRef6, x, y) {
    
    $(IdRef6).stop().animate({
        left: x - 10,
        top: y - 10
    }, function () {
        animateDiv(IdRef6);
    });
};

function grow(IdRef7) {
    var size = $(IdRef7).height();
    size = size*1.5;
    $(IdRef7).stop().animate({
        height: size,
        width: 'auto'
    }, 3000,function(){
        setTimeout(function() {   
            shrink("#fish1Id");
         }, 3000);
        animateDiv(IdRef7);
    });
    
};
function shrink(IdRef8){
    var smallSize = $(IdRef8).height();
    smallSize = smallSize/1.5;
    $(IdRef8).stop().animate({
        height: smallSize,
        width: 'auto'
    }, 3000,function(){
        animateDiv(IdRef8);
    });
};