// moving around of the orange fish

$('#fish1Id').ready(function () {
    movingAround('#fish1Id');
});

// moving around of the blue fish

$('#fish2Id').ready(function () {
    movingAround('#fish2Id');
});

// blue fish animation on hover

$('#fish2Id').hover(function () {
    var position = randomPosition(this);
    $(this).stop().animate({
        top: position[0],
        left: position[1]
    }, 800, function () {
        movingAround(this)
    })
});

// orange fish double click resize

$('#fish1Id').dblclick(function () {
    doubleClickFish(this);
});

// moving orange fish on the screen by clicking

$(document).click(function (event) {
    var x = event.pageX - 125;
    var y = event.pageY - 125;
    $('#fish1Id').stop().animate({
        top: y,
        left: x
    }, function () {
        movingAround(this)
    })


});

// Bubbles click fades them out, fades in, then moves up again

$('#bubble1Id').click(function () {
    $(this).stop().fadeOut(200, function () {
        $(this).fadeIn();
        moveBubble('#bubble1Id')
    });
});
$('#bubble2Id').click(function () {
    $(this).stop().fadeOut(200, function () {
        $(this).fadeIn();
        moveBubble('#bubble2Id')
    });
});
$('#bubble3Id').click(function () {
    $(this).stop().fadeOut(200, function () {
        $(this).fadeIn();
        moveBubble('#bubble3Id')
    });
});
$('#bubble4Id').click(function () {
    $(this).stop().fadeOut(200, function () {
        $(this).fadeIn();
        moveBubble('#bubble4Id')
    });
});

// Bubbles moving initialize

$('#bubble1Id').ready(function () {
    moveBubble('#bubble1Id');
});
$('#bubble2Id').ready(function () {
    setTimeout(function () {
        moveBubble('#bubble2Id')
    }, 2500);
});
$('#bubble3Id').ready(function () {
    setTimeout(function () {
        moveBubble('#bubble3Id')
    }, 3500);
});
$('#bubble4Id').ready(function () {
    setTimeout(function () {
        moveBubble('#bubble4Id')
    }, 1000);
});

// Double click to resize the orange fish

function doubleClickFish(fish) {

    $(fish).stop().animate({
        width: '+=100px',
        height: '+=100px'
    }).delay(800).animate({
        width: '-=100px',
        height: '-=100px'
    }, function () {
        movingAround(fish)
    });
};

// Hover the blue fish for it to move

function movingAround(fish) {
    var position = randomPosition(fish);
    $(fish).stop().animate({
        top: position[0],
        left: position[1]
    }, 6000, function () {
        movingAround(fish)
    })
}

function randomPosition(fish) {
    var x = Math.floor(Math.random() * ($(document).width() - $(fish).width()));
    var y = Math.floor(Math.random() * ($(document).height() - $(fish).height()));
    console.log(x + " " + y)
    var array = [y, x];
    return array;
}


$(document).ready(function () {
    var bubbles = [$('#bubble1Id'), $('#bubble2Id'), $('#bubble3Id'), $('#bubble4Id')]
    for (var i = 0; i <= 3; i++) {
        bubbles[i].offset({
            top: $(document).height()
        })

    }
});
// set prime position of the bubble



function moveBubble(bubble) {
    var bubbleStartPosition;
    bubbleStartPosition = randomBubblePosition(bubble);
    $(bubble).stop().offset({
        top: bubbleStartPosition[1],
        left: bubbleStartPosition[0]
    });
    $(bubble).stop().animate({
        top: -$(document).height() + $(bubble).height()
    }, 12000, 'linear', function () {
        moveBubble(bubble)
    });
}

function randomBubblePosition(bubble) {
    var x = Math.floor(Math.random() * ($(document).width() - $(bubble).width()));
    var y = $(document).height();
    console.log("bubble" + x + " " + y)
    var array = [x, y];
    return array;
}