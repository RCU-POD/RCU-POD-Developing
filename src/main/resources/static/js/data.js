$(function () {
    $("#inputSearch").shieldAutoComplete({
        dataSource: {
            data: cafe,
            filter: { path: "name", filter: "contains", value: "" }
        },
        textTemplate: function (item) {
            return '<div class="flag flag-' + item.code.toLowerCase() + '" style="float:left; margin-top:5px; margin-right:5px;"></div> ' +
                item.name ;
        },
        valueTemplate: "{name}",
        minLength: 2
    });
});
