(window.webpackJsonp=window.webpackJsonp||[]).push([[0],{23:function(e,t,a){e.exports=a.p+"static/media/REGIONAL_GLOBAL_DEFAULT.a2cdf3c6.jpg"},25:function(e,t,a){e.exports=a(60)},30:function(e,t,a){},31:function(e,t,a){e.exports=a.p+"static/media/logo.5d5d9eef.svg"},32:function(e,t,a){},60:function(e,t,a){"use strict";a.r(t);var n=a(0),s=a.n(n),c=a(22),o=a.n(c),i=(a(30),a(6)),r=a(7),l=a(9),m=a(8),d=a(10),u=(a(31),a(32),a(12)),p=a.n(u),f=a(61),v=function(e){var t=e.song;return s.a.createElement(f.a,{style:{textDecoration:"none"},to:"/songInfo/"+t.name},s.a.createElement("div",{className:"song-card"},s.a.createElement("div",{className:"col-xs-12 col-lg-9 col-xl-8"},s.a.createElement("div",{className:"row"},s.a.createElement("div",{className:"col-sm-1"},s.a.createElement("i",{className:"fa fa-music"})),s.a.createElement("div",{className:"col-lg-9"},t.name),s.a.createElement("div",{className:"col-sm-2"},function(e){var t=Math.floor(e/6e4),a=(e%6e4/1e3).toFixed(0);return t+":"+(a<10?"0":"")+a}(t.duration_ms))),s.a.createElement("div",{className:"row"},s.a.createElement("div",{className:"col-sm-1"}),s.a.createElement("div",{className:"col-4"},t.artists)))))},E=function(e){function t(e){return Object(i.a)(this,t),Object(l.a)(this,Object(m.a)(t).call(this,e))}return Object(d.a)(t,e),Object(r.a)(t,[{key:"getcards",value:function(){return this.props.songs.map(function(e,t){return s.a.createElement(v,{key:t,song:e})})}},{key:"render",value:function(){return s.a.createElement("div",null,this.getcards())}}]),t}(s.a.Component),h=a(23),g=a.n(h),N=function(e){function t(e){var a;return Object(i.a)(this,t),(a=Object(l.a)(this,Object(m.a)(t).call(this,e))).state={songs:[],search:""},a}return Object(d.a)(t,e),Object(r.a)(t,[{key:"componentDidMount",value:function(){var e=this;p.a.get("/topsongs").then(function(t){e.setState({songs:t.data})})}},{key:"searchChange",value:function(e){var t=this,a=e.target.value;""!==a?p.a.get("/filtersong?name="+a).then(function(e){t.setState({songs:e.data})}):p.a.get("/topsongs").then(function(e){t.setState({songs:e.data})})}},{key:"handleSort",value:function(e,t){var a=this.state.songs;a.sort(function(e){var t=arguments.length>1&&void 0!==arguments[1]?arguments[1]:"asc";return function(a,n){if(!a.hasOwnProperty(e)||!n.hasOwnProperty(e))return 0;var s="string"===typeof a[e]?a[e].toUpperCase():a[e],c="string"===typeof n[e]?n[e].toUpperCase():n[e],o=0;return s<c?o=1:s>c&&(o=-1),"desc"===t?-1*o:o}}(e,t)),this.setState({songs:a})}},{key:"filter",value:function(e){var t=e.split("-");this.handleSort(t[1],t[0])}},{key:"render",value:function(){var e=this;return s.a.createElement("div",{className:"container song-container"},s.a.createElement("div",{className:"row"},s.a.createElement("div",{className:"col-sm-4"}),s.a.createElement("div",{className:"col-sm-4"},s.a.createElement("input",{type:"text",onChange:function(t){e.searchChange(t)},placeholder:"Search by name or artist ...",className:"form-control",id:"usr"})),s.a.createElement("div",{className:"col-sm-4"},s.a.createElement("div",{className:"dropdown"},s.a.createElement("button",{type:"button",className:"btn btn-primary dropdown-toggle","data-toggle":"dropdown"},"Sort By"),s.a.createElement("div",{className:"dropdown-menu"},s.a.createElement("h5",{className:"dropdown-header"},"Ascending"),s.a.createElement("div",{className:"dropdown-item",id:"asc-duration_ms",onClick:function(t){e.filter(t.target.id)}},"Time"),s.a.createElement("div",{className:"dropdown-item",id:"asc-danceability",onClick:function(t){e.filter(t.target.id)}},"Danceability"),s.a.createElement("div",{className:"dropdown-item",id:"asc-loudness",onClick:function(t){e.filter(t.target.id)}},"Loudness"),s.a.createElement("div",{className:"dropdown-item",id:"asc-speechiness",onClick:function(t){e.filter(t.target.id)}},"speechiness"),s.a.createElement("h5",{className:"dropdown-header"},"Descending"),s.a.createElement("div",{id:"desc-duration_ms",className:"dropdown-item",onClick:function(t){e.filter(t.target.id)}},"Time"),s.a.createElement("div",{id:"desc-danceability",className:"dropdown-item",onClick:function(t){e.filter(t.target.id)}},"Danceability"),s.a.createElement("div",{id:"desc-loudness",className:"dropdown-item",onClick:function(t){e.filter(t.target.id)}},"Loudness"),s.a.createElement("div",{id:"desc-speechiness",className:"dropdown-item",onClick:function(t){e.filter(t.target.id)}},"speechiness"))))),s.a.createElement("div",{className:"row"},s.a.createElement("div",{className:"col-sm-4"},s.a.createElement("img",{className:"image",src:g.a})),s.a.createElement("div",{className:"col-sm-8"},s.a.createElement(E,{songs:this.state.songs}))))}}]),t}(s.a.Component),b=a(62),y=a(63),w=a(64),k=function(e){function t(e){var a;return Object(i.a)(this,t),(a=Object(l.a)(this,Object(m.a)(t).call(this,e))).state={song:{}},a}return Object(d.a)(t,e),Object(r.a)(t,[{key:"componentDidMount",value:function(){var e=this,t=this.props.match.params.id;p.a.get("/song?id="+t).then(function(t){e.setState({song:t.data})})}},{key:"render",value:function(){return s.a.createElement("div",{className:"container info-card"},s.a.createElement("div",null,s.a.createElement("span",{className:"info-text"},"Name"),":  ",s.a.createElement("span",{className:"info-value"},this.state.song.name)),s.a.createElement("div",null,s.a.createElement("span",{className:"info-text"},"Artist"),":",s.a.createElement("span",{className:"info-value"},this.state.song.artists)),s.a.createElement("div",null,s.a.createElement("span",{className:"info-text"},"Rank"),":  ",s.a.createElement("span",{className:"info-value"},this.state.song.rank)),s.a.createElement("div",null,s.a.createElement("span",{className:"info-text"},"Danceability"),":  ",s.a.createElement("span",{className:"info-value"},this.state.song.danceability)),s.a.createElement("div",null,s.a.createElement("span",{className:"info-text"},"Energy"),":  ",s.a.createElement("span",{className:"info-value"},this.state.song.energy)),s.a.createElement("div",null,s.a.createElement("span",{className:"info-text"},"Loudness"),":  ",s.a.createElement("span",{className:"info-value"},this.state.song.loudness)),s.a.createElement("div",null,s.a.createElement("span",{className:"info-text"},"Speechiness"),":  ",s.a.createElement("span",{className:"info-value"},this.state.song.speechiness)),s.a.createElement("div",null,s.a.createElement("span",{className:"info-text"},"Tempo"),":  ",s.a.createElement("span",{className:"info-value"},this.state.song.tempo)))}}]),t}(s.a.Component),O=function(e){function t(){return Object(i.a)(this,t),Object(l.a)(this,Object(m.a)(t).apply(this,arguments))}return Object(d.a)(t,e),Object(r.a)(t,[{key:"render",value:function(){return s.a.createElement(b.a,null,s.a.createElement("div",{className:"app"},s.a.createElement("header",{className:"app-header"},"Spotify"),s.a.createElement(y.a,{exact:!0,path:"",render:function(){return s.a.createElement(w.a,{to:"/songs"})}}),s.a.createElement(y.a,{exact:!0,path:"/songs",component:N}),s.a.createElement(y.a,{exact:!0,path:"/songInfo/:id",component:k})))}}]),t}(n.Component);a(55),a(56),a(59),Boolean("localhost"===window.location.hostname||"[::1]"===window.location.hostname||window.location.hostname.match(/^127(?:\.(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)){3}$/));o.a.render(s.a.createElement(O,null),document.getElementById("root")),"serviceWorker"in navigator&&navigator.serviceWorker.ready.then(function(e){e.unregister()})}},[[25,1,2]]]);
//# sourceMappingURL=main.96f0347b.chunk.js.map