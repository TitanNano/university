var deleteNode= function(list, content){
    var node= null;
    var current= list.first;

    while(!node && current){
        if(current.key == content){
            node= current;
            break;
        }else{
            current= current.next;
        }
    }

    if(node){
        node.prev.next= node.next;
        node.next.prev= node.last;
    }
};
