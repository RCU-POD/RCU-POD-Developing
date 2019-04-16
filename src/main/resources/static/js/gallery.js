
$(".image1").click(function(){
  setModalGalery(".image1","FOTOGRAFÍA: de Chevanon Photography, de Pexels.");  
})
$(".image2").click(function(){
    setModalGalery(".image2","FOTOGRAFÍA: de Daria Shevtsova, de Pexels.");  
})
$(".image3").click(function(){
    setModalGalery(".image3","FOTOGRAFÍA: de Elina Sazonova, de Pexels.");  
})
$(".image4").click(function(){
  setModalGalery(".image4","FOTOGRAFÍA: de Olle, de Pexels.");  
})
$(".image5").click(function(){
    setModalGalery(".image5","FOTOGRAFÍA: de Free-Photos, de Pixabay.");  
})
$(".image6").click(function(){
    setModalGalery(".image6","FOTOGRAFÍA: de kaboompics, de Pixabay.");  
})
$(".image7").click(function(){
    setModalGalery(".image7","FOTOGRAFÍA: de Kaboompics .com, de Pexels.");  
})

var setModalGalery = function(image,text){
    var img = $(image).css('background-image');
    imgUrl = img.replace('url(','').replace(')','').replace(/\"/gi, "");    
    $(".image-modal-gallery").attr("src",imgUrl);
    $(".text-modal-gallery").text(text);
}