
$(".image1").click(function(){
  setModalGalery(".image1","imagen1");  
})
$(".image2").click(function(){
    setModalGalery(".image2","imagen2");  
})
$(".image3").click(function(){
    setModalGalery(".image3","imagen3");  
})
$(".image4").click(function(){
  setModalGalery(".image4","imagen4");  
})
$(".image5").click(function(){
    setModalGalery(".image5","imagen5");  
})
$(".image6").click(function(){
    setModalGalery(".image6","imagen6");  
})
$(".image7").click(function(){
    setModalGalery(".image7","imagen7");  
})

var setModalGalery = function(image,text){
    var img = $(image).css('background-image');
    imgUrl = img.replace('url(','').replace(')','').replace(/\"/gi, "");    
    $(".image-modal-gallery").attr("src",imgUrl);
    $(".text-modal-gallery").text(text);
}