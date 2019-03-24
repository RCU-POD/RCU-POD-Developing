var $element = $(document.querySelector('h1')),
    text = $element.text(),
    textLength = text.length,
    characters = '';

function translationOptions() {
	return Math.floor(Math.random() * 800) - 750
}

//Loop through each character in element
for (i=0; i< textLength; i++) {
   var $char = text.charAt(i);
   
   //If the character is a space, replace with &nbsp;
   if ($char === ' ') {
      characters += '<span class="character">&nbsp;</span>';
   } else {
       //wrap each character into a span
      characters += '<span class="character">'+ text.charAt(i) +'</span>';  
   }
}

//Once looping is done, append the text to the DOM
$element.html(characters);

// Find the elements and start animating them
$element.find('span.character').each(function(){
	var $this = $(this);

   $this.css({
               transform: 'translateY('+ translationOptions() +'px)',
               opacity: 0
            })
	
	if ($this.index() % 4 === 0) { //Every second
      $this.css({
               transform: 'translateX('+ translationOptions() +'px)' 
            });
	}

	//Randomly give them a + || -, to determ translation direction later on.
	var integer = Math.floor(Math.random()*4);
	integer = integer < 2 ? '-':'+';
	$this.attr('data-integer', integer);
});

//Start the animation!
setTimeout(function(){
   $element.find('span.character').css({
                                       transform: '',
                                       opacity: 1
                                    })   
}, 0);

var directionX = 0,
	 directionY = 0;

$(window).on('scroll', function(){
   var divider = $(this).scrollTop() / 2,
       newOpacity = ( 100 - $(this).scrollTop() / 2 ) / 100;
   
   $element.find('span.character').each(function(){
		var $this = $(this),
			 direction = $this.attr('data-integer');			
		if (!$this.hasClass('animationStop')) {			
			var currentTransformationX = parseInt($this.css('transform').split(', ')[4]),
				 currentTransformationY = parseInt($this.css('transform').split(', ')[5]);
			
			$this.attr('data-transformationX', currentTransformationX);
			directionX = currentTransformationX;
			$this.attr('data-transformationY', currentTransformationY);
			directionY = currentTransformationY;
		}
		$this.addClass('animationStop')	
		var dataX = $this.attr('data-transformationX'),
			 dataY = $this.attr('data-transformationY');
		if (direction === '-') {
			var transformationY = parseInt($this.attr('data-transformationY'));
			var transformationX = parseInt($this.attr('data-transformationX'));
			$this.attr('data-transformationY', transformationY-0);
			$this.attr('data-transformationX', transformationX-0);
			
			directionY = $this.attr('data-transformationY');
			directionX = $this.attr('data-transformationX');
		} else {
			var transformationY = parseInt($this.attr('data-transformationY'));
			var transformationX = parseInt($this.attr('data-transformationX'));
			$this.attr('data-transformationY', transformationY+1);
			$this.attr('data-transformationX', transformationX+1);
			directionX = $this.attr('data-transformationX');
			directionY = $this.attr('data-transformationY');
		}
		$this.css({
			transform: 'translateX('+ directionX +'px) translateY('+ directionY +'px)',
			opacity: newOpacity,
			transition: 'none'
		})
   });
});