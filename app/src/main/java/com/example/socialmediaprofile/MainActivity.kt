package com.example.socialmediaprofile

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.layout.ModifierLocalBeyondBoundsLayout
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.socialmediaprofile.ui.theme.SocialMediaProfileTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MainScreen()

        }
    }
}

@Composable
fun MainScreen() {

    var follower by remember { mutableStateOf(704) }

    var follow  by remember { mutableStateOf("follow") }
    Column(
        modifier = Modifier
            .fillMaxSize()
            .verticalScroll(rememberScrollState()),
        horizontalAlignment = Alignment.CenterHorizontally,

        ) {
        Image(
            painter = painterResource(id = R.drawable.img),
            null,
            modifier = Modifier
                .size(150.dp)
                .padding(top = 30.dp)
        )

        Text(
            "Dino James",
            fontWeight = FontWeight.Bold,
            fontSize = 30.sp,
            modifier = Modifier.padding(top = 10.dp),
            color = Color(0xFF1B2457)
        )

        Text(
            "Indore,Mp",
            fontWeight = FontWeight.W400,
            fontSize = 18.sp,
            modifier = Modifier.padding(),
            color = Color(0xFF9EA0AD)
        )

        Spacer(modifier = Modifier.height(15.dp))

        Text(
            "I'm a positive person.I Love to travel and eat\n                   Aslo a fitness freak",
            fontWeight = FontWeight.W400,
            fontSize = 18.sp,
            modifier = Modifier.padding(),
            color = Color(0xFF1B2457)
        )

        Spacer(modifier = Modifier.height(15.dp))

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 50.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween
        ) {

            Box(modifier = Modifier.border(1.dp, color = Color.Gray, shape = CircleShape)) {
                Image(
                    painter = painterResource(id = R.drawable.img_1),
                    null,
                    modifier = Modifier
                        .size(50.dp)
                        .padding(10.dp)
                )
            }

            Button(
                {
                    if (follow == "Following"){
                        follow = "Follow"
                    }else {  follow = "Following"}

                    if (follow == "Following"){
                        follower = 705
                    }else{follower--}


                },
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color(0xFF257FDC)
                )
            ) {
                Text(
                    follow,
                    fontWeight = FontWeight.Normal,
                    fontSize = 20.sp,
                    modifier = Modifier.padding(horizontal = 30.dp, vertical = 5.dp),
                    color = Color(0xFFFFFFFF),
                )
            }

            Box(modifier = Modifier.border(1.dp, color = Color.Gray, shape = CircleShape)) {
                Image(
                    painter = painterResource(id = R.drawable.img_2),
                    null,
                    modifier = Modifier
                        .size(50.dp)
                        .padding(10.dp)
                )
            }
        }

        Spacer(modifier = Modifier.height(40.dp))

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 30.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Column(horizontalAlignment = Alignment.CenterHorizontally) {
                Text(
                    text = "$follower",
                    fontWeight = FontWeight.W900,
                    fontSize = 25.sp,
                    modifier = Modifier.padding(top = 10.dp),
                    color = Color(0xFF1B2457)
                )

                Spacer(modifier = Modifier.height(12.dp))

                Text(
                    "Followers",
                    fontWeight = FontWeight.W500,
                    fontSize = 15.sp,
                    modifier = Modifier.padding(),
                    color = Color(0xFF9EA0AD)
                )

            }

            Spacer(
                modifier = Modifier
                    .padding(horizontal = 5.dp)
                    .height(75.dp)
                    .width(1.dp)
                    .background(color = Color.Gray)
            )

            Column(horizontalAlignment = Alignment.CenterHorizontally) {
                Text(
                    "478",
                    fontWeight = FontWeight.W900,
                    fontSize = 25.sp,
                    modifier = Modifier.padding(top = 10.dp),
                    color = Color(0xFF1B2457)
                )

                Spacer(modifier = Modifier.height(12.dp))

                Text(
                    "Followings",
                    fontWeight = FontWeight.W500,
                    fontSize = 15.sp,
                    modifier = Modifier.padding(),
                    color = Color(0xFF9EA0AD)
                )

            }

            Spacer(
                modifier = Modifier
                    .padding(horizontal = 5.dp)
                    .height(75.dp)
                    .width(1.dp)
                    .background(color = Color.Gray)
            )

            Column(horizontalAlignment = Alignment.CenterHorizontally) {
                Text(
                    "120k",
                    fontWeight = FontWeight.W900,
                    fontSize = 25.sp,
                    modifier = Modifier.padding(top = 10.dp),
                    color = Color(0xFF1B2457)
                )

                Spacer(modifier = Modifier.height(12.dp))

                Text(
                    "Likes",
                    fontWeight = FontWeight.W500,
                    fontSize = 15.sp,
                    modifier = Modifier.padding(),
                    color = Color(0xFF9EA0AD)
                )

            }
        }

        Spacer(modifier = Modifier.height(40.dp))

        Spacer(
            modifier = Modifier
                .height(15.dp)
                .background(color = Color(0xFFECE6E6))
                .fillMaxWidth()
        )

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 10.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Text(
                "Followers",
                fontWeight = FontWeight.Bold,
                fontSize = 19.sp,
                modifier = Modifier.padding(top = 15.dp),
                color = Color(0xFF151515)
            )

            Text(
                "View All",
                fontWeight = FontWeight.Bold,
                fontSize = 15.sp,
                modifier = Modifier.padding(top = 15.dp),
                color = Color(0xFF3648B4)
            )
        }

        LazyRow { items(list) { it -> ImageSus(it) } }

        Spacer(
            modifier = Modifier
                .height(15.dp)
                .background(color = Color(0xFFECE6E6))
                .fillMaxWidth()
        )

        Text(
            "Posts",
            fontWeight = FontWeight.W900,
            fontSize = 20.sp,
            modifier = Modifier
                .padding(top = 15.dp, start = 15.dp)
                .align(Alignment.Start),
            color = Color(0xFF000000)

        )
//1
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 20.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceEvenly
        ) {
            Posts(R.drawable.img_10)
            Posts(R.drawable.img_9)
            Posts(R.drawable.img_8)
        }

        ///2
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 10.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Posts(R.drawable.img_11)
            Posts(R.drawable.img_12)
            Posts(R.drawable.img_14)
        }
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 20.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceEvenly
        ) {
            Posts(R.drawable.img_10)
            Posts(R.drawable.img_9)
            Posts(R.drawable.img_8)
        }


    }
}

//Follow
@Composable
fun Follow() {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 50.dp),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceBetween
    ) {

        Box(modifier = Modifier.border(1.dp, color = Color.Gray, shape = CircleShape)) {
            Image(
                painter = painterResource(id = R.drawable.img_1),
                null,
                modifier = Modifier
                    .size(50.dp)
                    .padding(10.dp)
            )
        }

        Button(
            {},
            colors = ButtonDefaults.buttonColors(
                containerColor = Color(0xFF257FDC)
            )
        ) {
            Text(
                "Follow",
                fontWeight = FontWeight.Normal,
                fontSize = 20.sp,
                modifier = Modifier.padding(horizontal = 30.dp, vertical = 5.dp),
                color = Color(0xFFFFFFFF),
            )
        }

        Box(modifier = Modifier.border(1.dp, color = Color.Gray, shape = CircleShape)) {
            Image(
                painter = painterResource(id = R.drawable.img_2),
                null,
                modifier = Modifier
                    .size(50.dp)
                    .padding(10.dp)
            )
        }
    }
}


@Composable
fun Posts(img: Int) {
    Image(
        painter = painterResource(id = img),
        null,
        modifier = Modifier
            .height(120.dp)
            .width(120.dp),
        contentScale = ContentScale.FillBounds
    )

}

@Composable
fun DisplayFollowers(modifier: Modifier = Modifier) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 30.dp),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        Column(horizontalAlignment = Alignment.CenterHorizontally) {
            Text(
                "704",
                fontWeight = FontWeight.W900,
                fontSize = 25.sp,
                modifier = Modifier.padding(top = 10.dp),
                color = Color(0xFF1B2457)
            )

            Spacer(modifier = Modifier.height(12.dp))

            Text(
                "Followers",
                fontWeight = FontWeight.W500,
                fontSize = 15.sp,
                modifier = Modifier.padding(),
                color = Color(0xFF9EA0AD)
            )

        }

        Spacer(
            modifier = Modifier
                .padding(horizontal = 5.dp)
                .height(75.dp)
                .width(1.dp)
                .background(color = Color.Gray)
        )

        Column(horizontalAlignment = Alignment.CenterHorizontally) {
            Text(
                "478",
                fontWeight = FontWeight.W900,
                fontSize = 25.sp,
                modifier = Modifier.padding(top = 10.dp),
                color = Color(0xFF1B2457)
            )

            Spacer(modifier = Modifier.height(12.dp))

            Text(
                "Followings",
                fontWeight = FontWeight.W500,
                fontSize = 15.sp,
                modifier = Modifier.padding(),
                color = Color(0xFF9EA0AD)
            )

        }

        Spacer(
            modifier = Modifier
                .padding(horizontal = 5.dp)
                .height(75.dp)
                .width(1.dp)
                .background(color = Color.Gray)
        )

        Column(horizontalAlignment = Alignment.CenterHorizontally) {
            Text(
                "120k",
                fontWeight = FontWeight.W900,
                fontSize = 25.sp,
                modifier = Modifier.padding(top = 10.dp),
                color = Color(0xFF1B2457)
            )

            Spacer(modifier = Modifier.height(12.dp))

            Text(
                "Likes",
                fontWeight = FontWeight.W500,
                fontSize = 15.sp,
                modifier = Modifier.padding(),
                color = Color(0xFF9EA0AD)
            )

        }
    }
}


@Composable
fun ImageSus(data: Data) {
    Column(
        modifier = Modifier.padding(vertical = 20.dp, horizontal = 10.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Image(
            painter = painterResource(id = data.image),
            null,
            modifier = Modifier
                .size(80.dp)
        )

        Text(
            data.name,
            fontWeight = FontWeight.W900,
            fontSize = 15.sp,
            modifier = Modifier.padding(top = 10.dp),
            color = Color(0xFF1B2457)
        )
    }
}

@Preview(showBackground = true)
@Composable
private fun Ui() {
    MainScreen()
}

