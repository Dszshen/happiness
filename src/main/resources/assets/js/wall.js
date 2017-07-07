(function ($) {
  new grid3D(document.getElementById('grid3d'));

  // Instantiate wookmark after all images have been loaded
  var wookmark,
    container = '#container',
    $container = $(container),
    $window = $(window),
    $document = $(document);

  imagesLoaded(container, function () {
    wookmark = new Wookmark(container, {
      offset: 15, // Optional, the distance between grid items
      itemWidth: 270 // Optional, the width of a grid item
    });
  });

  /**
   * When scrolled all the way to the bottom, add more tiles
   */
  function onScroll() {
    // Check if we're within 100 pixels of the bottom edge of the broser window.
    var winHeight = window.innerHeight ? window.innerHeight : $window.height(), // iphone fix
      closeToBottom = ($window.scrollTop() + winHeight > $document.height() - 100);

    if (closeToBottom) {
      //加载更多数据。。。。。。
      $.ajax({
        url: '/wall/more',
        type: 'get',
        data:{pageSize:10},
        success: function (data) {
          var morePics = $(data).clone().css('opacity', 0);
          $container.append(morePics);
          wookmark.initItems();
          wookmark.layout(true, function () {
            // Fade in items after layout
            setTimeout(function () {
              morePics.css('opacity', 1);
            }, 300);
          });
          new grid3D(document.getElementById('grid3d'));
        },
        error: function (XMLHttpRequest, textStatus, errorThrown) {
          console.log("error", textStatus);
        }
      });
    }
  }

  // Capture scroll event.
  $window.bind('scroll.wookmark', onScroll);
})(jQuery);