$(document).ready(function(){
    let $contenedor=$('.contenedor-menu');
    let $li = $('.menu li:has(ul)');
    $($li).click(function(e){
        e.preventDefault();        
        if($(this).hasClass('activado')){
            $(this).removeClass('activado');
            $(this).children('ul').slideUp();        
        } else {
            $(this).addClass('activado');
            $(this).children('ul').slideDown();
        }
    });
    $('.menu').on('click','a',function(){                   
          $(this).children('.derecha').toggleClass('rotar'); 
    });
    
    $('.menu li ul').on('click','a',function(e){   
        window.location.href = $(this).attr("href");
        e.stopPropagation();
        $contenedor.removeClass('mostrar');
         if($li.hasClass('activado')){
            $($li).removeClass('activado');
            $($li).children('ul').slideUp();        
        } else {
            $($li).addClass('activado');
            $($li).children('ul').slideDown();
        }
        $('.menu a').children('.derecha').removeClass('rotar');

    });  
    $('#btn-menu').on('click',function(){
        $contenedor.toggleClass('mostrar');
    });
});