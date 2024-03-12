/**
 * 하나의 서블릿이 다 받아낼 수 있어야함  
 * 1. 요청을 통일한다. 무식, 뒤에 파라미터를 붙여서 파라미터의 값으로 요청을 구분하게
 * getDateTime?type=date , type=time 근데 이렇게 안함
 * 2. 주소자체가 요청이 다름
 * 주소를 바꾸되 서픽스?suffix 
 * mvc/getDate.do 뒤에 고정해서 붙이는 
 * 서픽스 통일시켜놓고 
 * 모든것들.do 로 끝나는 주소는 하나의 서블릿이 받자 
 * 관습적으로 많이 씀 
 * URL Mapping.do 
 */
const getContextPath = ()=>{

  const host = location.host; /*호스트 localhost:8080 호스트의 시작위치에 호스트 길이를 더해주면 슬래시 위치를 구할 수 있다?*/ 
  const url  = location.href; /*url http://localhost:8080 /getDate.do */
  const begin = url.indexOf(host) + host.length; 
  const end = url.indexOf('/',begin + 1);
  return url.substring(begin,end); // begin 포함 end 불포함  /mvc 반환

}
 



 const getDateTime = ()=>{
   const type = document.getElementById('type');
   if(type.value === 'date'){
     location.href = getContextPath()+'/getDate.do';
   } else if(type.value === 'time'){
     location.href = getContextPath()+'/getTime.do';
   } else if(type.value === 'datetime'){
     location.href = getContextPath()+'/getDateTime.do';
   }
   
 }
 document.getElementById('btn').addEventListener('click',getDateTime);