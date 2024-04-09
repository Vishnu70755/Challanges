var animation = gsap.timeline(); 

animation.fromTo(".title", 
                 {y: -45, opacity: 0}, 
                 {y: 0, opacity: 1, ease: "easeInQuad"})
         
         .fromTo(".description", 
                 {y: -30, opacity:0}, 
                 {y: 0, opacity: 1, ease: "easeInQuad"})

         .fromTo(".main_cta", 
                 {y: -15, opacity:0}, 
                 {y: 0, opacity: 1, ease: "easeInQuad"})

         .fromTo("nav", {opacity: 0}, {opacity: 1})
