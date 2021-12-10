document.addEventListener("DOMContentLoaded", function(e) {
    var yabv = document.querySelector("#yabv");
    var tar = document.getElementsByClassName('cbwf-stage-view')[0];

    // Insert the new node before the reference node
    tar.parentNode.insertBefore(yabv, tar.nextSibling);
})