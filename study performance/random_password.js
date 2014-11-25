(function(){
    console.log('generating password...');
    var result= '';
    for(var i= 0; i < 12; i++){
        result+= String.fromCharCode((Math.random() * 95) + 33);
    }
    
    console.log('Your new password: '+ result);
}).apply(global);