console.log('Reply Module....')

var replyService = (function () {

    // 실행할 함수 정의하는 공간.....
    function add(reply, callback, error) {
        console.log("add reply...........");

        $.ajax({
            type: 'post',            // 전송 방식
            url: '/replies/new',      // url 주소
            data: JSON.stringify(reply),
            contentType: "application/json; charset=utf-8",
            success: function (result, status, xhr) {
                if (callback) {       //status: 상태정보, xhr:통신객체 정보(비동기데이터 전송요청) 이 둘은 생략 가능
                    callback(result);
                }
            },
            error: function (xhr, status, err) {
                if (error) {
                    error(err);
                }
            }
        });
    } // end for add

    function getList(param, callback, error) {
        var bno = param.bno;
        var page = param.page || 1; // 페이지값이 날라오지 않으면 디폴트 값으로 1을 줌

        $.getJSON("/replies/pages/" + bno + "/" + page + ".json", // getJSON 데이터 요청할 때 사용
            function(data) {
                if (callback) {
                    //callback(data); //댓글 목록만 가져오는 경우 사용
                    callback(data.replyCnt, data.list);
                }
            }).fail(function(xhr, status, err) {
                if (error) {
                    error(err);
                }
            });
    } //end for getList

    function remove(rno, callback, error){
        $.ajax({
            type:'delete',
            url:'/replies/'+rno,
            success:function(deleteResult, status,xhr){
                if(callback) callback(deleteResult);
            },
            error:function(xhr,status,err){
                if(error) error(err);
            }
        });
    } //end for remove

    function update(reply, callback, error){

        $.ajax({
            type:'put',
            url:'/replies/' + reply.rno,
            data:JSON.stringify(reply),
            contentType:"application/json; charset=utf-8",
            success:function(result,status,xhr){
                if(callback){
                    callback(result);
                }
            },
            error:function(xhr, status, err){
                if(error){
                    error(err);
                }
            }
        });
    } //end for update

    function get(rno, callback, error){
        console.log("get..........................");

        // $.ajax({
        //     type:'get',
        //     url:'/replies/get/' + rno,
        //     success:function(result,status,xhr){
        //         if(callback){
        //             callback(result);
        //         }
        //     },
        //     error:function(xhr, status, err){
        //         if(error){
        //             error(err);
        //         }
        //     }
        // });

        $.get("/replies/get/"+ rno + ".json",
        function(data){
            if(callback){
                callback(data);
            }
        }).fail(function(xhr,status,err){
            if(error){
                error(err);
            }
        });
    } //end for get

    function displayTime(timeValue){
        var today = new Date();
        var gap = today.getTime() - timeValue;
        var dateObj = new Date(timeValue);
        var str = "";

        if(gap < 60*60*24*1000){ // 단위가 밀리초이기 때문에 1000 곱해줌
            var hh = dateObj.getHours();
            var mi = dateObj.getMinutes();
            var ss = dateObj.getSeconds();

            return [(hh>9 ? '' : '0')+ hh, ':', (mi>9?'':'0')+ mi, ':', (ss>9?'':'0')+ ss].join('');
        }else{
            var yy = dateObj.getFullYear();
            var mm = dateObj.getMonth()+1;
            var dd = dateObj.getDay();

            return [yy, '/', (mm>9? '':'0')+ mm, '/', (dd>9?'':'0')+ dd].join('');
        }
    }
    return { 
        add : add, // add는 함수 전체
        getList : getList, // getList는 add 함수를 참조
        remove : remove,
        update : update,
        get : get,
        displayTime : displayTime
    }; // 함수를 객체로 만들어서 리턴
})();