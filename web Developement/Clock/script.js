function updateClock() {
    const clockContainer = document.getElementById("clock");
    const currentTime = new Date();
    const hours = currentTime.getHours().toString().padStart(2, "0");
    const minutes = currentTime.getMinutes().toString().padStart(2, "0");
    const seconds = currentTime.getSeconds().toString().padStart(2, "0");
  
    const timeString = `${hours}:${minutes}:${seconds}`;
    clockContainer.textContent = timeString;
  }
  
  setInterval(updateClock, 1000);
  function updateClock() {
    const clockContainer = document.getElementById("clock");
    const currentTime = new Date();
    const hours = currentTime.getHours().toString().padStart(2, "0");
    const minutes = currentTime.getMinutes().toString().padStart(2, "0");
    const seconds = currentTime.getSeconds().toString().padStart(2, "0");
  
    const timeString = `${hours}  ${minutes}   ${seconds}`;
    clockContainer.textContent = timeString;
  }
  
  setInterval(updateClock, 1000);
    