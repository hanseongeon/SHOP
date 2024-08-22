'use client'
interface pageInterface {
    children: React.ReactNode,
}

export default function Lay(props: Readonly<pageInterface>) {

    return <div>
        <div className=""></div>
        {props?.children}
    </div>
}