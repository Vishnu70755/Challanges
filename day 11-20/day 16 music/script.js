// Navbar and move to top button
const body = document.querySelector("body");
const navbar = document.querySelector(".navbar");
const menu = document.querySelector(".menu-list");
const menuBtn = document.querySelector(".menu-btn");
const cancelBtn = document.querySelector(".cancel-btn");

menuBtn.onclick = () => {
  menu.classList.add("active");
  menuBtn.classList.add("hide");
  cancelBtn.classList.add("show");
  body.classList.add("disabledScroll");
}

cancelBtn.onclick = () => {
  menu.classList.remove("active");
  menuBtn.classList.remove("hide");
  cancelBtn.classList.remove("show");
  body.classList.remove("disabledScroll");
}

const siteLogo = document.querySelector('.logo a');

// Get all the menu items
const navLinks = document.querySelectorAll('.menu-list li');

const playSongBtn = document.querySelector('.play-song-btn');

// Add click event listener to each menu item
navLinks.forEach(item => {
  item.addEventListener('click', function () {
    // Remove the 'active' class from all menu items
    navLinks.forEach(menuItem => menuItem.classList.remove('active-menu-list'));

    // Add the 'active' class to the clicked menu item
    this.classList.add('active-menu-list');
  });
});

playSongBtn.onclick = () => {
  removeActiveClass();
}

siteLogo.onclick = () => {
  removeActiveClass();
};

function removeActiveClass() {
  navLinks.forEach(menuItem => menuItem.classList.remove('active-menu-list'));
}

window.onscroll = () => {
  this.scrollY > 20 ? navbar.classList.add("sticky") : navbar.classList.remove("sticky");

  // When the user scrolls down 75px from the top of the document, show the button
  if (document.body.scrollTop > 75 || document.documentElement.scrollTop > 75) {
    moveTopBtn.style.display = "block";
  } else {
    moveTopBtn.style.display = "none";
  }
}

// PLAY MUSIC 
const playSong = document.getElementById("song");
var icon = document.getElementById("icon");

icon.addEventListener("click", playMusic);

function playMusic() {
  if (playSong.paused) {
    playSong.play();
    icon.src = "pause.png";
  } else {
    playSong.pause();
    icon.src = "play.png";
  }
}

// Move to Top button
var moveTopBtn = document.getElementById("moveTopBtn");

// When the user clicks on the button, scroll to the top of the document
function topFunction() {
  document.body.scrollTop = 0;
  document.documentElement.scrollTop = 0;
  removeActiveClass();
}

// PreLoader
var loader = document.getElementById("loading");
function preLoader() {
  loader.style.display = "none";
}

// CHOOSE A SONG
const buttons = document.querySelectorAll(".btn");

const photo = document.getElementById("banner");
const song = document.getElementById("song");
const songName = document.getElementById("songName");
const songBy = document.getElementById("songBy");
const aboutSong = document.getElementById("aboutSong");
const title = document.getElementById("title");
const download = document.getElementById("download");

buttons[0].addEventListener("click", () => {
  icon.src = "play.png";
  photo.src = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQkSZ0knPalUP8QIRboht9Iq92a_dDFfhYfDg&s";
  song.src = "https://www.pagalworld.com.cm/files/download/id/4285";
  songName.innerText = "hanuman";
  songBy.innerText = "hanuman";
  title.innerText = "hanuman";
  download.href = "https://www.pagalworld.com.cm/files/download/id/4285";
  aboutSong.innerText = "Devotion in Every Note 🙏   Feel the devotion and surrender in the voice of renowned artists as they channel the divine energy through their musical expressions. The Hanuman Chalisa comes alive with a fusion of traditional instruments and modern arrangements, creating a devotional ambiance like never before."});

buttons[1].addEventListener("click", () => {
  icon.src = "play.png";
  photo.src = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQNBoGAVJnbc2LbGPmFp3ErOKoAjif325QxgJQXoFWtgDJsJsCkBUHDHDZ2qwMQfia1lUA&usqp=CAU";
  song.src = "https://www.pagalworldl.com/files/download/id/24993";
  songName.innerText = "om namah shivaya ";
  songBy.innerText = "Lauv";
  title.innerText = " I Like Me Better";
  download.href = "https://www.pagalworldl.com/files/download/id/24993";
  aboutSong.innerText = "“I Like Me Better” is a song recorded by American singer-songwriter Lauv. It was released on May 19, 2017, and is included on Lauv's compilation album I Met You When I Was 18, which was released on May 31, 2018. It has also been used in an Android Auto app commercial, in the trailer of Netflix's romantic comedy To All the Boys I've Loved Before, and in the fall ball episode of Netflix's comedy series The Expanding Universe of Ashley Garcia.";
});

buttons[2].addEventListener("click", () => {
  icon.src = "play.png";
  photo.src = "https://paglasongs.com/uploads/thumb/sft30/14594_4.jpg";
  song.src = "https://paglasongs.com/files/download/id/14594";
  songName.innerText = "Mazaak";
  songBy.innerText = "Anuv Jain";
  title.innerText = "Mazaak";
  download.href = "https://paglasongs.com/files/download/id/14594";
  aboutSong.innerText = "Bob Marley's Spiritual Fusion: Om Namah Shivaya 🕉️  Dive into the enchanting world of Bob Marley's rendition of Om Namah Shivaya on our music streaming app. In this transcendent masterpiece, Marley effortlessly blends reggae vibes with the sacred mantra, creating a musical journey that resonates with spiritual seekers and music lovers alike.";
});

buttons[3].addEventListener("click", () => {
  icon.src = "play.png";
  photo.src = "https://pagalsongs.com.in/siteuploads/thumb/sft12/5787_7.webp";
  song.src = "https://paglasongs.com/files/download/id/14594";
  songName.innerText = " Betty (Get Money)";
  songBy.innerText = "Yung Gravy";
  title.innerText = "Betty (Get Money)";
  download.href = "https://paglasongs.com/files/download/id/14594";
  aboutSong.innerText = `"Embark on an Emotional Journey with "Nijame Ne Chebuthunna" 🌟

  Indulge your senses in the soul-stirring melodies of "Nijame Ne Chebuthunna," a musical gem that transcends emotions. On our music streaming app, this song unveils an enchanting fusion of poignant lyrics and melodious composition.`;
});

buttons[4].addEventListener("click", () => {
  icon.src = "play.png";
  photo.src = "https://pagalsongs.com.in/siteuploads/thumb/sft6/2781_7.webp";
  song.src = "https://pagalsongs.com.in/files/download?id=5787";
  songName.innerText = "Mary On A Cross";
  songBy.innerText = "Ghost";
  title.innerText = "Mary On A Cross";
  download.href = "https://pagalsongs.com.in/files/download?id=5787";
  aboutSong.innerText = `"🎶 Experience the Vibrancy of "Vellake" on Our Music Streaming App! 🌟

  Dive into the rhythmic beats and infectious energy of "Vellake," a musical sensation that brings the essence of celebration to your playlist. On our app, this dynamic track promises an exhilarating experience that captures the spirit of joy and liveliness..`;
});

buttons[5].addEventListener("click", () => {
  icon.src = "play.png";
  photo.src = "https://pagalsongs.com.in/siteuploads/thumb/sft6/2781_7.webp";
  song.src = "https://pagalsongs.com.in/files/download?id=2781";
  songName.innerText = "Baaraat";
  songBy.innerText = "Ritviz";
  title.innerText = "Baaraat";
  download.href = "https://pagalsongs.com.in/files/download?id=2781";
  aboutSong.innerText = `🎶 Savor the Sweet Melodies of "Priyamithunam" on Our Music Streaming App! 🌺

  Indulge in the enchanting romance of "Priyamithunam," a musical masterpiece that weaves a tale of love through its captivating melodies. On our app, this soulful track promises a journey through emotions, offering a harmonious blend of heartfelt lyrics and melodic richness
  `;
});

buttons[6].addEventListener("click", () => {
  icon.src = "play.png";
  photo.src = "https://paglasongs.com.se/siteuploads/thumb/sft2/656_4.jpg";
  song.src = "https://paglasongs.com.se/files/download/id/656";
  songName.innerText = "Ishq Bulaava";
  songBy.innerText = "Vishal-Shekhar & Shipra Goyal";
  title.innerText = "Ishq Bulaava";
  download.href = "https://paglasongs.com.se/files/download/id/656";
  aboutSong.innerText = "🎶 Immerse in the Soulful Sounds of Pranam Alladi Podha on Our Music Streaming App! 🌼  Embark on a musical journey with the heartfelt rhythms of Pranam Alladi Podha, a captivating composition that resonates with emotion. On our app, this enchanting track promises a unique blend of traditional and contemporary elements, creating an immersive experience for every listener";
});

buttons[7].addEventListener("click", () => {
  icon.src = "play.png";
  photo.src = "https://paglasongs.com/uploads/thumb/sft30/14871_4.jpg";
  song.src = "https://paglasongs.com.se/files/download/id/656";
  songName.innerText = "Katputli Ke Dhaage";
  songBy.innerText = "Anumita Nadesan & Himonshu Parikh";
  title.innerText = "Katputli Ke Dhaage";
  download.href = "https://paglasongs.com.se/files/download/id/656";
  aboutSong.innerText = " Immerse Yourself in Divine Bliss with Om Deva Deva on Our Music Streaming App! 🕉️  Step into a realm of spiritual tranquility as you explore the sacred echoes of Om Deva Deva. This enchanting composition, available exclusively on our app, beckons you to experience the divine through its serene melodies and soul-soothing chants";
});

buttons[8].addEventListener("click", () => {
  icon.src = "play.png";
  photo.src = "https://upload.wikimedia.org/wikipedia/en/7/78/Happy_Days_%282007_film%29.jpg";
  song.src = "https://paglasongs.com/files/download/id/14871";
  songName.innerText = "Tu/You";
  songBy.innerText = "Armaan Malik";
  title.innerText = "Tu/You";
  download.href = "https://paglasongs.com/files/download/id/14871";
  aboutSong.innerText = " Elevate Your Spirits with the Joyful Beats of Kushi Title Song on Our Music Streaming App! 🌈  Get ready to embark on a euphoric journey as you tune in to the infectious rhythm of the Kushi Title Song. This musical gem promises to fill your playlist with exuberance and bring a burst of happiness to your listening experience";
});

